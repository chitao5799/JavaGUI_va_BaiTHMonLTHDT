/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author NCT99
 */
public class MessageDialog extends JFrame {
        private JLabel label;

    public MessageDialog(){
        this.setSize(150,150);
        
        setLocation(100, 100);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//tắt chạy console khi close bỏ frame.
        label=new JLabel("text của label");
        add(label);
        JButton jb=new JButton("button");
        add(jb,"North",1); //north là hướng và ở trên cùng, 1 là chỉ số index của các thành phần có của frame này
        jb.addActionListener(new ActionListener() {

            //@Override
            public void actionPerformed(ActionEvent e) { 
                //đây là message dialog, dùng joptionpane, dùng ở nhiều chỗ, vd như try catch để hiện thị lỗi
                String name=" message của tôi";
                JOptionPane.showMessageDialog(null, "name:"+name,"title",JOptionPane.QUESTION_MESSAGE/*icon có thể dổi*/);
            }
        });
    }
    public static void main(String[] r)
    {
        MessageDialog he=new MessageDialog();
    }
}
