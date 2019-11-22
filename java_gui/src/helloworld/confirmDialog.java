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
//import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author NCT99
 */
public class confirmDialog extends JFrame {
        private JLabel label;

    public confirmDialog(){
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
              //  đây là confirm dialog(có 3 lựa chọn: yes, no, cancel), dùng joptionpane, dùng ở nhiều chỗ, 
                String name=" message của tôi";
               int click= JOptionPane.showConfirmDialog(null, "name:"+name);
               if(click==JOptionPane.YES_OPTION)
               {
                   //code xử lý khi người dùng chọn yes.
                   JOptionPane.showMessageDialog(null, "đã chọn yes. ");
               }
               else if(click==JOptionPane.NO_OPTION)
               {
                   //code xử lý khi người dùng chọn no.
                   JOptionPane.showMessageDialog(null, "đã chọn no. ");
               }
               else if(click==JOptionPane.CANCEL_OPTION)
               {
                   //code xử lý khi người dùng chọn cancel.
                   JOptionPane.showMessageDialog(null, "đã chọn cancel. ");
               }
               else if(click==JOptionPane.CLOSED_OPTION)
               {
                   //code xử lý khi người dùng chọn close.
                   JOptionPane.showMessageDialog(null, "đã chọn đóng cửa sổ. ");
               }
                //chỉ hiện thị yes hoặc no, có thể tùy chọn hiện thị ở tham số thứ 4.
              //  JOptionPane.showConfirmDialog(rootPane, "thông điệp", "tiêu đề", JOptionPane.YES_NO_OPTION);
            }
        });
    }
    public static void main(String[] r)
    {
        confirmDialog he=new confirmDialog();
    }
}

