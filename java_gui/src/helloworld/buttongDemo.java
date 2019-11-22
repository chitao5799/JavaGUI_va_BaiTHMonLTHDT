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

/**
 *
 * @author NCT99
 */
public class buttongDemo extends JFrame implements ActionListener{
    private JLabel label;
    private JButton button1;
    public buttongDemo(){
        this.setSize(150,150);
        
        setLocation(100, 100);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//tắt chạy console khi close bỏ frame.
        label=new JLabel("text của label");
        add(label);
        JButton jb=new JButton("button");
        add(jb,"North",1); //north là hướng và ở trên cùng, 1 là chỉ số index của các thành phần có của frame này
        jb.addActionListener(new ActionListener() {//CÁCH 1 ĐỂ BẮT EVENT KHI CLICK CHUỘT TRÁI

            //@Override
            public void actionPerformed(ActionEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    changeText();           
            }
        });
        button1=new JButton("hit me");
        add(button1,"South",1);
       // button1.setIcon("tangDa.jpg");
        button1.addActionListener(this); // this này là buttongDemo vì nó đã implements ActionListener
    } 
    public void actionPerformed(ActionEvent e) { //CÁCH 2 ĐỂ BẮT EVENT , phải implement actionlistener
        JButton b=(JButton) e.getSource();
        if(b == button1){
            label.setText("text khác .");
        }
    }
    public void changeText() {
            label.setText("text mới thay thế");
    }
        public static void main(String[] r)
    {
        buttongDemo he=new buttongDemo();
    }
}
