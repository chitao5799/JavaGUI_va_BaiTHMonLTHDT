///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package frame_dialog;
//
///**
// *
// * @author NCT99
// */
//import java.awt.*;
//Import java.awt.event.*;
//public class DemoFrame3
//{
//    public static void main(String[] args)
//    {
//        MyFrame myFrame = new MyFrame("Example on my frame");
//        myFrame.setSize(500, 400);
//        myFrame.setVisible(true);
//        myFrame.addWindowListener(newWindowAdapter()
//        {
//            public voidwindowClosing(WindowEvente){
//                System.exit(0);
//            }
//        });
//    }
//}
//Class MyFrame extends Frame implements ActionListener
//{ 
//    private MenuBar menuBar;
//
//    private Menu menu;
//    private MenuItem circleItem, rectItem;
//    public MyFrame(String title)
//    { super(title);
//    menuBar = new MenuBar();
//    setMenuBar(menuBar);
//    menu = new Menu("Draw");
//    menuBar.add(menu);
//    circleItem = new MenuItem("Circle");
//    rectItem = new MenuItem("Rectangle");
//    menu.add(circleItem); menu.add(rectItem);
//    circleItem.addActionListener(this);
//    rectItem.addActionListener(this);
//    public void actionPerformed(ActionEvent e)
//    {
//        if (e.getSource() == circleItem)
//        {
//            MyDialog dialog = new MyDialog(this, "Modeless Dialog: Circle", false);
//        }
//    }
//    }
//}
//Class MyDialog extends Dialog
//{ MyDialog(Frame parent, String title, boolean isModel)
//{ super(parent, title, isModel);
//add(newLabel("Hi, I am a dialog"), BorderLayout.CENTER);
//setSize(300, 200); setVisible(true);
//addWindowListener(newMyDialogListener(this));
//}
//}
// Co the dat lop nay lam lop nội (inner class) cua lop MyDialog
//class MyDialogListener extends WindowAdapter
//{
//Dialog dialog;
//MyDialogListener(Dialog dia){dialog = dia;}
//public void window Closing(WindowEvent e)
//{
//dialog.setVisible(false);
//dialog.dispose();
//}
//}