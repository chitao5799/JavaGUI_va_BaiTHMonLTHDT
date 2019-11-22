/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author NCT99
 */
public class hello extends JFrame{
    public hello(){
        setSize(200,180);
        
        setLocation(200, 300);
        setVisible(true);
        setResizable(false);
        JLabel label=new JLabel("hello world");
        add(label);
        
    }
    public static void main(String[] r)
    {
        hello he=new hello();
    }
}
