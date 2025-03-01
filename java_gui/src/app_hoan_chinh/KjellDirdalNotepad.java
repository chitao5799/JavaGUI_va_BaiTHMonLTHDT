/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_hoan_chinh;

/**
 *
 * @author NCT99
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyVetoException;

import javax.swing.DefaultDesktopManager;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JViewport;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class KjellDirdalNotepad extends JFrame {
  private MDIDesktopPane desktop = new MDIDesktopPane();

  private JMenuBar menuBar = new JMenuBar();

  private JMenu fileMenu = new JMenu("File");

  private JMenuItem newMenu = new JMenuItem("New");

  private JScrollPane scrollPane = new JScrollPane();

  public KjellDirdalNotepad() {
    menuBar.add(fileMenu);
    menuBar.add(new WindowMenu(desktop));
    fileMenu.add(newMenu);
    setJMenuBar(menuBar);
    setTitle("MDI Test");
    scrollPane.getViewport().add(desktop);
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(scrollPane, BorderLayout.CENTER);

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
    newMenu.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        desktop.add(new TextFrame());
      }
    });

  }

  public static void main(String[] args) {
    KjellDirdalNotepad notepad = new KjellDirdalNotepad();
    notepad.setSize(600, 400);
    notepad.setVisible(true);
  }

}

class TextFrame extends JInternalFrame {
  private JTextArea textArea = new JTextArea();

  private JScrollPane scrollPane = new JScrollPane();

  public TextFrame() {
    setSize(200, 300);
    setTitle("Edit Text");
    setMaximizable(true);
    setIconifiable(true);
    setClosable(true);
    setResizable(true);
    scrollPane.getViewport().add(textArea);
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(scrollPane, BorderLayout.CENTER);
  }
}

/**
 * An extension of WDesktopPane that supports often used MDI functionality. This
 * class also handles setting scroll bars for when windows move too far to the
 * left or bottom, providing the MDIDesktopPane is in a ScrollPane.
 */
class MDIDesktopPane extends JDesktopPane {
  private static int FRAME_OFFSET = 20;

  private MDIDesktopManager manager;

  public MDIDesktopPane() {
    manager = new MDIDesktopManager(this);
    setDesktopManager(manager);
    setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
  }

  public void setBounds(int x, int y, int w, int h) {
    super.setBounds(x, y, w, h);
    checkDesktopSize();
  }

  public Component add(JInternalFrame frame) {
    JInternalFrame[] array = getAllFrames();
    Point p;
    int w;
    int h;

    Component retval = super.add(frame);
    checkDesktopSize();
    if (array.length > 0) {
      p = array[0].getLocation();
      p.x = p.x + FRAME_OFFSET;
      p.y = p.y + FRAME_OFFSET;
    } else {
      p = new Point(0, 0);
    }
    frame.setLocation(p.x, p.y);
    if (frame.isResizable()) {
      w = getWidth() - (getWidth() / 3);
      h = getHeight() - (getHeight() / 3);
      if (w < frame.getMinimumSize().getWidth())
        w = (int) frame.getMinimumSize().getWidth();
      if (h < frame.getMinimumSize().getHeight())
        h = (int) frame.getMinimumSize().getHeight();
      frame.setSize(w, h);
    }
    moveToFront(frame);
    frame.setVisible(true);
    try {
      frame.setSelected(true);
    } catch (PropertyVetoException e) {
      frame.toBack();
    }
    return retval;
  }

  public void remove(Component c) {
    super.remove(c);
    checkDesktopSize();
  }

  /**
   * Cascade all internal frames
   */
  public void cascadeFrames() {
    int x = 0;
    int y = 0;
    JInternalFrame allFrames[] = getAllFrames();

    manager.setNormalSize();
    int frameHeight = (getBounds().height - 5) - allFrames.length * FRAME_OFFSET;
    int frameWidth = (getBounds().width - 5) - allFrames.length * FRAME_OFFSET;
    for (int i = allFrames.length - 1; i >= 0; i--) {
      allFrames[i].setSize(frameWidth, frameHeight);
      allFrames[i].setLocation(x, y);
      x = x + FRAME_OFFSET;
      y = y + FRAME_OFFSET;
    }
  }

  /**
   * Tile all internal frames
   */
  public void tileFrames() {
    java.awt.Component allFrames[] = getAllFrames();
    manager.setNormalSize();
    int frameHeight = getBounds().height / allFrames.length;
    int y = 0;
    for (int i = 0; i < allFrames.length; i++) {
      allFrames[i].setSize(getBounds().width, frameHeight);
      allFrames[i].setLocation(0, y);
      y = y + frameHeight;
    }
  }

  /**
   * Sets all component size properties ( maximum, minimum, preferred) to the
   * given dimension.
   */
  public void setAllSize(Dimension d) {
    setMinimumSize(d);
    setMaximumSize(d);
    setPreferredSize(d);
  }

  /**
   * Sets all component size properties ( maximum, minimum, preferred) to the
   * given width and height.
   */
  public void setAllSize(int width, int height) {
    setAllSize(new Dimension(width, height));
  }

  private void checkDesktopSize() {
    if (getParent() != null && isVisible())
      manager.resizeDesktop();
  }
}

/**
 * Private class used to replace the standard DesktopManager for JDesktopPane.
 * Used to provide scrollbar functionality.
 */
class MDIDesktopManager extends DefaultDesktopManager {
  private MDIDesktopPane desktop;

  public MDIDesktopManager(MDIDesktopPane desktop) {
    this.desktop = desktop;
  }

  public void endResizingFrame(JComponent f) {
    super.endResizingFrame(f);
    resizeDesktop();
  }

  public void endDraggingFrame(JComponent f) {
    super.endDraggingFrame(f);
    resizeDesktop();
  }

  public void setNormalSize() {
    JScrollPane scrollPane = getScrollPane();
    int x = 0;
    int y = 0;
    Insets scrollInsets = getScrollPaneInsets();

    if (scrollPane != null) {
      Dimension d = scrollPane.getVisibleRect().getSize();
      if (scrollPane.getBorder() != null) {
        d.setSize(d.getWidth() - scrollInsets.left - scrollInsets.right, d.getHeight()
            - scrollInsets.top - scrollInsets.bottom);
      }

      d.setSize(d.getWidth() - 20, d.getHeight() - 20);
      desktop.setAllSize(x, y);
      scrollPane.invalidate();
      scrollPane.validate();
    }
  }

  private Insets getScrollPaneInsets() {
    JScrollPane scrollPane = getScrollPane();
    if (scrollPane == null)
      return new Insets(0, 0, 0, 0);
    else
      return getScrollPane().getBorder().getBorderInsets(scrollPane);
  }

  private JScrollPane getScrollPane() {
    if (desktop.getParent() instanceof JViewport) {
      JViewport viewPort = (JViewport) desktop.getParent();
      if (viewPort.getParent() instanceof JScrollPane)
        return (JScrollPane) viewPort.getParent();
    }
    return null;
  }

  protected void resizeDesktop() {
    int x = 0;
    int y = 0;
    JScrollPane scrollPane = getScrollPane();
    Insets scrollInsets = getScrollPaneInsets();

    if (scrollPane != null) {
      JInternalFrame allFrames[] = desktop.getAllFrames();
      for (int i = 0; i < allFrames.length; i++) {
        if (allFrames[i].getX() + allFrames[i].getWidth() > x) {
          x = allFrames[i].getX() + allFrames[i].getWidth();
        }
        if (allFrames[i].getY() + allFrames[i].getHeight() > y) {
          y = allFrames[i].getY() + allFrames[i].getHeight();
        }
      }
      Dimension d = scrollPane.getVisibleRect().getSize();
      if (scrollPane.getBorder() != null) {
        d.setSize(d.getWidth() - scrollInsets.left - scrollInsets.right, d.getHeight()
            - scrollInsets.top - scrollInsets.bottom);
      }

      if (x <= d.getWidth())
        x = ((int) d.getWidth()) - 20;
      if (y <= d.getHeight())
        y = ((int) d.getHeight()) - 20;
      desktop.setAllSize(x, y);
      scrollPane.invalidate();
      scrollPane.validate();
    }
  }
}

/**
 * Menu component that handles the functionality expected of a standard
 * "Windows" menu for MDI applications.
 */
class WindowMenu extends JMenu {
  private MDIDesktopPane desktop;

  private JMenuItem cascade = new JMenuItem("Cascade");

  private JMenuItem tile = new JMenuItem("Tile");

  public WindowMenu(MDIDesktopPane desktop) {
    this.desktop = desktop;
    setText("Window");
    cascade.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        WindowMenu.this.desktop.cascadeFrames();
      }
    });
    tile.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        WindowMenu.this.desktop.tileFrames();
      }
    });
    addMenuListener(new MenuListener() {
      public void menuCanceled(MenuEvent e) {
      }

      public void menuDeselected(MenuEvent e) {
        removeAll();
      }

      public void menuSelected(MenuEvent e) {
        buildChildMenus();
      }
    });
  }

  /* Sets up the children menus depending on the current desktop state */
  private void buildChildMenus() {
    int i;
    ChildMenuItem menu;
    JInternalFrame[] array = desktop.getAllFrames();

    add(cascade);
    add(tile);
    if (array.length > 0)
      addSeparator();
    cascade.setEnabled(array.length > 0);
    tile.setEnabled(array.length > 0);

    for (i = 0; i < array.length; i++) {
      menu = new ChildMenuItem(array[i]);
      menu.setState(i == 0);
      menu.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
          JInternalFrame frame = ((ChildMenuItem) ae.getSource()).getFrame();
          frame.moveToFront();
          try {
            frame.setSelected(true);
          } catch (PropertyVetoException e) {
            e.printStackTrace();
          }
        }
      });
      menu.setIcon(array[i].getFrameIcon());
      add(menu);
    }
  }

  /*
   * This JCheckBoxMenuItem descendant is used to track the child frame that
   * corresponds to a give menu.
   */
  class ChildMenuItem extends JCheckBoxMenuItem {
    private JInternalFrame frame;

    public ChildMenuItem(JInternalFrame frame) {
      super(frame.getTitle());
      this.frame = frame;
    }

    public JInternalFrame getFrame() {
      return frame;
    }
  }
}
