/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author NCT99
 */
public class MenuV implements ActionListener{
    private JMenuItem imenu,imenuOpen,imenuSava,imenuExit;
    
    public static void main(String[] args) {
        new MenuV();
    }
    public MenuV(){
        JFrame frame=new JFrame("menu demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JMenuBar menuBar=new JMenuBar(); //JMenuBar thanh menu
        frame.setJMenuBar(menuBar);
        
        JMenu file=new JMenu("file");  //JMenu các mục trên menubar
        file.setMnemonic(KeyEvent.VK_F); //alt + f
        menuBar.add(file);
         
         imenu =new JMenuItem("New");//JMenuItem các mục con của 1 mục trong menubar
        imenu.setMnemonic(KeyEvent.VK_N);
        imenu.addActionListener(this);
        file.add(imenu);
                
         imenuOpen =new JMenuItem("Open");
        imenuOpen.setMnemonic(KeyEvent.VK_O);
        imenuOpen.addActionListener(this);
        file.add(imenuOpen);
        
         imenuSava =new JMenuItem("Save");
        imenuSava.setMnemonic(KeyEvent.VK_S);
        imenuSava.addActionListener(this);
        file.add(imenuSava);
         
        file.addSeparator();
         imenuExit =new JMenuItem("Exit");
        imenuExit.setMnemonic(KeyEvent.VK_X);
        imenuExit.addActionListener(this);
        file.add(imenuExit);
        
        JMenu edit=new JMenu("edit");
        edit.setMnemonic(KeyEvent.VK_E);
        menuBar.add(edit);
        
        JMenu menuFind=new JMenu("Find");
        menuFind.setMnemonic(KeyEvent.VK_I);
        edit.add(menuFind);
        
        JMenuItem imeTop =new JMenuItem("Top");
        imeTop.setMnemonic(KeyEvent.VK_T);
        menuFind.add(imeTop);
        
        JMenuItem imenuLow =new JMenuItem("Low");
        imenuLow.setMnemonic(KeyEvent.VK_L);
        menuFind.add(imenuLow);
        
        JMenu help=new JMenu("help");
        menuBar.add(help);
        
        frame.setSize(300,350);
        frame.setResizable(false);
        frame.setVisible(true);//nên để cái này ở dưới để chạy nó hiện thị luôn các thành phần thêm vào
        //frame nếu ko phải thu nhỏ xuống taskbar xong hiển lên mới đc.
    }
    @Override
    public void actionPerformed(ActionEvent e) {
           JMenuItem item=(JMenuItem)e.getSource();
           if(item==imenu){
               JOptionPane.showMessageDialog(null,"đã chọn new");
           }
           if(item==imenuOpen){
               JOptionPane.showMessageDialog(null, "đã chọn open");
           }
           if(item==imenuSava){
               JOptionPane.showMessageDialog(null, "đã chọn save");
           }
           if(item==imenuExit){
               System.exit(0);
           }
    }

    
}
