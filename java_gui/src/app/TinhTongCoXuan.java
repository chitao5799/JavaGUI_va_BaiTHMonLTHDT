/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
//import java.awt.LayoutManager;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//import sun.font.Decoration;

/**
 *
 * @author NCT99
 */
public class TinhTongCoXuan extends Frame implements ActionListener{

    
    
    //khai báo khởi tạo các thành phần giao diện.
   Label lb1=new Label("nhập số a:");
   Label lb2=new Label("nhập số b:");
   Label lb3=new Label("kết quả:");
    TextField a =new TextField("3",20);
    TextField b =new TextField("5",20);
    TextField kq =new TextField("",20);
    Button tong =new Button("tính tổng");
    Button thoat =new Button("thoát");
    public TinhTongCoXuan(){
            setLayout(new FlowLayout());

        //đây là các điều khiển vào bộ vi xử lý sự kiện
        tong.addActionListener(this);
        thoat.addActionListener(this);
        //đây là các điều khiển lên giao diện
        add(lb1); add(a);
        add(lb2); add(b);
        add(lb3);  add(kq);
       
       
      
        
        add(tong);add(thoat);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float aa,bb,tt;
        aa=Float.parseFloat(a.getText());
        bb=Float.parseFloat(b.getText());
        if(e.getSource()==tong)
        {
            tt=aa+bb;
            kq.setText(String.valueOf(tt));
        }
        if(e.getSource()==thoat)
            System.exit(1);
    
    }
    public static void main(String[] args) {
        TinhTongCoXuan t =new TinhTongCoXuan();
        t.setSize(300, 300);
        t.setResizable(false);
        t.setVisible(true);
        t.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
            
        });
    }
            
}
