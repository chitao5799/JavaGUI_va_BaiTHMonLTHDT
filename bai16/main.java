/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai16;

/**
 *
 * @author NCT99
 */
import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class main extends  Applet implements ActionListener{
    Label lb1,lb2,lb3,lb4 ;
    TextField r,b ,g, y; 
   Button ve;
   int rr,bb,gg,yy; //các số để thể hiện chiều cao của cột tương ứng với màu rr-red.

    public main()  
    {
        init();
    }
   
    
    @Override
   public final void init(){
         setLayout(new FlowLayout());

       lb1=new Label("Red");
       lb2=new Label("blue");
       lb3=new Label("yellow");
       lb4=new Label("green");
//       r=new TextField("70", 5);
//       b=new TextField("50", 5);
//       y=new TextField("80", 5);
//       ve=new Button("ve hinh");
       r=new TextField("70");
       b=new TextField("50");
       y=new TextField("80");
       g=new TextField("20");
       ve=new Button("Draw");
       
       rr=Integer.parseInt(r.getText());
       bb=Integer.parseInt(b.getText());
       yy=Integer.parseInt(y.getText());
       gg=Integer.parseInt(g.getText());
        add(lb1); add(r);
        add(lb2); add(b);
        add(lb3);add(y);
        add(lb4);add(g);
       
       
     //   add(paint();
        
        add(ve);
        ve.addActionListener(this);
   }
    @Override
   public void paint(Graphics g){
        //vẽ khung biểu đồ, 1 thanh đứng - 1 thanh ngang
       g.drawLine(50, 50, 50,400); //x1,y1,x2,y2 -thanh đứng                            
       g.drawLine(50, 400, 400, 400);  //thanh ngang
       
       // x là tọa độ x , y là tọa độ y -gốc tọa độ trên cùng bên trái    
       
       // vẽ các con số bên trái thanh thước.
       g.drawString("0", 32, 400); //giá trị , x, y
       g.drawString("50", 32, 350);
       g.drawString("100", 28, 300);
       g.drawString("150", 28, 250);
       g.drawString("200", 28, 200);
       g.drawString("250", 28, 150);
       g.drawString("300", 28, 100);
       g.drawString("350", 28, 50);
      
       
       g.setColor(Color.red);
       g.fillRect(70, 400-rr, 30, rr); // x, y, width, height
       g.drawString(String.valueOf(rr), 70, 400-rr);  /*giá trị số, x, y
                                                      // vẽ con số là chiều cao của cột,
                                                         hiển thị ở trên đỉnh cột */ 
       
       g.setColor(Color.blue);
       g.fillRect(140, 400-bb, 30, bb);
       g.drawString(String.valueOf(bb), 140, 400-bb);
       
       g.setColor(Color.yellow);
       g.fillRect(210, 400-yy, 30, yy);
       g.drawString(String.valueOf(yy), 210, 400-yy);
       
       g.setColor(Color.green);
       g.fillRect(280, 400-gg, 30, gg); 
       g.drawString(String.valueOf(gg), 280, 400-gg);
       
       
   }
    @Override
    public void actionPerformed(ActionEvent e) {
        int thoaManREd=1;
        int thoaManBLUE=1;
        int thoaManYELLOW=1;
        int thoaManGREEN=1;
        int thoaMan=1;
        if(r.getText().equals(""))
        { 
            thoaManREd=-1;thoaMan=-1;
            JOptionPane.showMessageDialog(null,"Trường red không được để trống!!!!  ", "Lỗi nhập",1);
        }
        else for(int i=0;i<r.getText().length();i++)
        {
            if((int)r.getText().charAt(i)<48 || (int)r.getText().charAt(i)>57){
                JOptionPane.showMessageDialog(null,"Trường red không được nhập ký tự khác ký tự số!!!!  ", "Lỗi nhập",1);
                thoaManREd=-1;thoaMan=-1;break;
            }
        }
        if(thoaManREd==1) 
             rr=Integer.parseInt(r.getText());
        ///
        if(b.getText().equals(""))
          { 
            thoaManBLUE=-1;thoaMan=-1;
            JOptionPane.showMessageDialog(null,"Trường blue không được để trống!!!!  ", "Lỗi nhập",1);
        }
        else for(int i=0;i<b.getText().length();i++)
        {
            if((int)b.getText().charAt(i)<48 || (int)b.getText().charAt(i)>57){
                JOptionPane.showMessageDialog(null,"Trường blue không được nhập ký tự khác ký tự số!!!!  ", "Lỗi nhập",1);
                thoaManBLUE=-1;thoaMan=-1;break;
            }
        }
        if(thoaManBLUE==1) 
            bb=Integer.parseInt(b.getText());
        //
        if(y.getText().equals(""))
           { 
            thoaManYELLOW=-1;thoaMan=-1;
            JOptionPane.showMessageDialog(null,"Trường yellow không được để trống!!!!  ", "Lỗi nhập",1);
        }
        else for(int i=0;i<y.getText().length();i++)
        {
            if((int)y.getText().charAt(i)<48 || (int)y.getText().charAt(i)>57){
                JOptionPane.showMessageDialog(null,"Trường yellow không được nhập ký tự khác ký tự số!!!!  ", "Lỗi nhập",1);
                thoaManYELLOW=-1;thoaMan=-1;break;
            }
        }
        if(thoaManYELLOW==1)  yy=Integer.parseInt(y.getText());
        //
        if(g.getText().equals(""))
          { 
            thoaManGREEN=-1;thoaMan=-1;
            JOptionPane.showMessageDialog(null,"Trường green không được để trống!!!!  ", "Lỗi nhập",1);
        }
        else for(int i=0;i<g.getText().length();i++)
        {
            if((int)g.getText().charAt(i)<48 || (int)g.getText().charAt(i)>57){
                JOptionPane.showMessageDialog(null,"Trường green không được nhập ký tự khác ký tự số!!!!  ", "Lỗi nhập",1);
                thoaManGREEN=-1;thoaMan=-1;break;
            }
        }
        if(thoaManGREEN==1)   gg=Integer.parseInt(g.getText());
//        if(thoaMan==1){
//            rr=Integer.parseInt(r.getText());
//            bb=Integer.parseInt(b.getText());
//            yy=Integer.parseInt(y.getText());
//            gg=Integer.parseInt(g.getText());
//        }
        if(rr<0 || rr >350 ){
            JOptionPane.showMessageDialog(null, "nhập số cho red từ 0 dến 350");
          //  return;
            thoaMan=-1;
        }
        if(yy<0 || yy >350){
            JOptionPane.showMessageDialog(null, "nhập số cho yellow từ 0 dến 350");
          //  return;
            thoaMan=-1;
        }
        if(bb<0 || bb >350){
            JOptionPane.showMessageDialog(null, "nhập số cho blue từ 0 dến 350");
            //return;
            thoaMan=-1;
        }
        if(gg<0 || gg >350){
            JOptionPane.showMessageDialog(null, "nhập số cho green từ 0 dến 350");
          //  return;
            thoaMan=-1;
        }
        if(e.getSource()==ve && thoaMan==1)
            repaint();
    }
    public static void main(String[] args) {
        main dtbcx=new main();
        //dtbcx.setVisible(true);
       JFrame frame=new JFrame();
       
       frame.setTitle("bài 16: vẽ biểu đồ");
       frame.add(dtbcx);
       frame.setSize(600,500);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
       frame.setResizable(false);
       // dtbcx.paint(new Graphics);
     //  dtbcx.paint(new Graphics());
    }
}
