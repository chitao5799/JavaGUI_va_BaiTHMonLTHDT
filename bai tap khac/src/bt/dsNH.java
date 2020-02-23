/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NCT99
 */
public class dsNH {
     ArrayList<nganhang> dsnh=new ArrayList<>();
     Scanner sc =new Scanner(System.in);
      public void nhap(){
       int i,soluong=-1;

        do{
          System.out.print("\nnhập số lượng ngân hàng:");
            
            try {
                soluong=sc.nextInt();
                sc.nextLine();
                if(soluong <= 0)
                System.out.print("\n !!!!!! SỐ LƯỢNG PHẢI LỚN HƠN 0. !!!!!! ");
                
            } catch (Exception e) {                
                System.out.print("\n!!!Lỗi: "+e.toString()+" ; phải nhập số nguyên.");                                      
                sc.nextLine();
            }
        }while (soluong <=  0); 
        
        for(i=0;i<soluong;i++)
        {         
           
        }}
}
