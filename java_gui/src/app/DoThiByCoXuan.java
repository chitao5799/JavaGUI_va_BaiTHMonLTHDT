/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

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

/**
 *
 * @author NCT99
 */
public class DoThiByCoXuan extends  Applet implements ActionListener{
    Label lb1,lb2,lb3,lb4 ;
    TextField r,b ,g, y;
   Button ve;
   int rr,bb,gg,yy;

    public DoThiByCoXuan()  
    {
        init();
    }
   
    
    @Override
   public final void init(){
         setLayout(new FlowLayout());

       lb1=new Label("Red");
       lb2=new Label("blue");
       lb3=new Label("green");
       r=new TextField("70", 5);
       b=new TextField("50", 5);
       y=new TextField("80", 5);
       ve=new Button("ve hinh");
       
       rr=Integer.parseInt(r.getText());
       bb=Integer.parseInt(b.getText());
       yy=Integer.parseInt(y.getText());
       
        add(lb1); add(r);
        add(lb2); add(b);
        add(lb3);add(y);
       
       
     //   add(paint();
        
        add(ve);
        ve.addActionListener(this);
   }
    @Override
   public void paint(Graphics g){
       g.drawLine(50, 50, 50, 250);
       g.drawLine(50, 250, 250, 250);
       
       g.setColor(Color.red);
       g.fillRect(70, 250-rr, 20, rr);
       g.drawString(String.valueOf(rr), 70, 250-rr);
       
       g.setColor(Color.blue);
       g.fillRect(110, 250-bb, 20, bb);
       g.drawString(String.valueOf(bb), 110, 250-bb);
       
       g.setColor(Color.yellow);
       g.fillRect(190, 250-yy, 20, yy);
       g.drawString(String.valueOf(yy), 190, 250-yy);
       
       
   }
    @Override
    public void actionPerformed(ActionEvent e) {
        rr=Integer.parseInt(r.getText());
        bb=Integer.parseInt(b.getText());
        yy=Integer.parseInt(y.getText());
        
        if(e.getSource()==ve)
            repaint();
    }
    public static void main(String[] args) {
        DoThiByCoXuan dtbcx=new DoThiByCoXuan();
        //dtbcx.setVisible(true);
       JFrame frame=new JFrame();
       
       frame.add(dtbcx);
       frame.setSize(500,500);
       frame.getDefaultCloseOperation();
       frame.setVisible(true);
       // dtbcx.paint(new Graphics);
     //  dtbcx.paint(new Graphics());
    }
}
