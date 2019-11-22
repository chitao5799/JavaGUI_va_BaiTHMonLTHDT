/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author NCT99
 */
public class labelDemo  extends JFrame{
    public labelDemo(){
        this.setSize(310,310);
        
        setLocation(100, 100);
        setVisible(true);
        setResizable(false);
        JLabel label=new JLabel("");
        add(label);
        
        
//        label.setText("thiết lập text hiện thị");
//        label.setToolTipText("di chuột vào sẽ hiện thị lên");
//        label.setForeground(Color.GREEN);
//        ImageIcon icon=new ImageIcon();
//        label.setIcon(icon);
        label.setSize(300,300);
        System.out.print("x:"+label.getSize().width+" y:"+label.getSize().height);
        
        setPicture(label, "tangDa.jpg");
       
    }
    public void setPicture(JLabel label, String filename ){
        try{
            BufferedImage bufferedImage=ImageIO.read(new File(filename));
            int x=label.getSize().width;
            int y=label.getSize().height;
            int imageX=bufferedImage.getWidth();
            int imageY=bufferedImage.getHeight();
            
            int dx=0;
            int dy=0;
            if(x/y > imageX/imageY)
            {
                dy=y;
                dx=dy*imageX/imageY;
            }
            else{
                dx=x;
                dy=dx*imageY/imageX;
            }
            ImageIcon myicon=new ImageIcon(bufferedImage.getScaledInstance(dx, dy, bufferedImage.SCALE_SMOOTH));
            label.setIcon(myicon);
        }catch(Exception e){}
    }
    public static void main(String[] r)
    {
        labelDemo he=new labelDemo();
    }
}