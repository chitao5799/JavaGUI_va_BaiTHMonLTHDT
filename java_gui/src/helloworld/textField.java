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
//import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author NCT99
 */
public class textField extends JFrame implements ActionListener{
        private JTextField tField;
        private JButton button;
        
    public textField(){
        this.setSize(300,300);
        
        setLocation(300, 300);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//tắt chạy console khi close bỏ frame.
        tField=new JTextField();
        add(tField,"North",0);
        
        button=new JButton("chọn");
        add(button,"South",0);
        button.addActionListener(this);//sẽ chạy method actionPerformed.
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(button==(JButton) e.getSource())
           /*câu lệnh này là khi nhập text vào textfield thì khi bấn button sẽ hiện thị text đó.*/
           JOptionPane.showMessageDialog(null,tField.getText() );
           //tField.setText("text mới");//khi bấm button sẽ hiện text này.
    }
public static void main(String[] r)
    {
        textField he=new textField();
    }

    
}