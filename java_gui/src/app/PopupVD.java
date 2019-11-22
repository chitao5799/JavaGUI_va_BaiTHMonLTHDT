/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;

/**
 *
 * @author NCT99
 */
public class PopupVD {
    public static void main(String[] args) {
        JFrame frame=new JFrame("popup");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPopupMenu popupMenu=new JPopupMenu("option");
        JMenuItem mCoppy=new JMenuItem("Coppy");
        JMenuItem mPaste=new JMenuItem("paste");
        JMenuItem mDelete=new JMenuItem("Delete");
        JMenuItem mproperty=new JMenuItem("Properties");
        popupMenu.add(mCoppy);
        popupMenu.add(mPaste);
        popupMenu.add(mDelete); 
        popupMenu.addSeparator();
        popupMenu.add(mproperty);
        
        JTextArea textArea=new JTextArea();
        textArea.setComponentPopupMenu(popupMenu);
        frame.add(textArea);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
