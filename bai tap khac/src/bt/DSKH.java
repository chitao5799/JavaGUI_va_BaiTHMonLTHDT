/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NCT99
 */
public class DSKH {
    ArrayList<KHACHHANG> dsKhachhang=new ArrayList<>();
   
    ArrayList<KHCaNhan> dsKhachhangCN=new ArrayList<>();
    ArrayList<KHDoanhNgiep> dsKhachhangDN=new ArrayList<>();
    Scanner sc =new Scanner(System.in);
   public void nhap(){
       int i,soluong=-1;

        do{
          System.out.print("\nnhập số lượng khách hàng:");
            
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
        String loaiNguoi;
        for(i=0;i<soluong;i++)
        {         
            System.out.print("\n Nhập loại người (\"kh cn\" HOẶC \"kh dn\"):");
            loaiNguoi=sc.nextLine();
            if(loaiNguoi.toLowerCase().equals("kh cn"))
            {
                KHCaNhan xkhcn=new KHCaNhan();
                xkhcn.nhap(); 
                KHACHHANG temp=new KHACHHANG();
                for ( int j=0;j<dsKhachhang.size();j++) {                    
                     temp=dsKhachhang.get(j);
                    if(xkhcn.getMaKH().equals(temp.getMaKH()))//==temp.maNV
                    {
                        System.out.println("\n !!!!!! WRONG!!: bạn đã nhập trùng mã kh,mời nhập lại !!!!!! ");
                        //break;
                        sc.nextLine();
                        String mamoi;                        
                        System.out.print("\n Nhập mã mới cho kh này:");
                        mamoi=sc.nextLine();
                        xkhcn.setMaKH(mamoi);//=mamoi;
                        j=-1;
                    }
                }    
                dsKhachhang.add(xkhcn);
                dsKhachhangCN.add(xkhcn);
            }
            else if(loaiNguoi.toLowerCase().equals("kh dn"))
            {
                 KHDoanhNgiep xKhachhang=new KHDoanhNgiep();
                xKhachhang.nhap(); 
                KHACHHANG temp=new KHACHHANG();
                for ( int j=0;j<dsKhachhang.size();j++) {                    
                     temp=dsKhachhang.get(j);
                    if(xKhachhang.getMaKH().equals(temp.getMaKH()))//==temp.maNV
                    {
                        System.out.println("\n !!!!!! WRONG!!: bạn đã nhập trùng mã kh,mời nhập lại !!!!!! ");
                        //break;
                        sc.nextLine();
                        String mamoi;                        
                        System.out.print("\n Nhập mã mới cho kh này:");
                        mamoi=sc.nextLine();
                        xKhachhang.setMaKH(mamoi);//=mamoi;
                        j=-1;
                    }
                }    
                dsKhachhang.add(xKhachhang);
                dsKhachhangDN.add(xKhachhang);
            }
            else i--;
        }                   
    }
   public void xuat(){
        
        for (KHACHHANG x : dsKhachhang) {
           
                System.out.print(x.toString()+"\n");
        }
    }
   public void XuatDSKHCaNhap(){
         if(dsKhachhangCN.isEmpty()){
            System.out.print("\n !!!Bạn chưa đọc file hoặc danh sách kh trống.");
            return;
        }
            System.out.print("\ndanh sách khách hàng cá nhân:");
            System.out.printf("\n%-7s%-25s%-25s%-14s%-15s%-12s%-20s","mã KH","tên KH","địa chỉ","số đt","số cmt","ngày cấp","nơi câp");
            for (KHCaNhan x : dsKhachhangCN) {
                x.xuat();
            }
    }
   public  void xuatDSKHDoanhNgiep(){
        if(dsKhachhangDN.isEmpty()){
            System.out.print("\n !!!Bạn chưa đọc file hoặc danh sách kh trống.");
            return;
        }
        System.out.println("\ndanh sách khách hàng doanh nghiệp:");
        System.out.printf("\n %-7s%-25s%-25s%-15s%-7s%-12s%-20s%-10s","mã KH","tên KH","địa chỉ",
                "email","số kd","ngày đk","nơi đăng ký","mã số thuế");
        for (KHDoanhNgiep temp : dsKhachhangDN) {
            temp.xuat();
        }
    }
   public void ghiFile(String filename) throws FileNotFoundException, IOException{
//          
       try{
             FileOutputStream fout = new FileOutputStream(filename);
            ObjectOutputStream out =new ObjectOutputStream(fout);
            out.writeObject(dsKhachhang); 
            out.writeObject(dsKhachhangCN); 
            out.writeObject(dsKhachhangDN); 
            out.close();
           fout.close();
       }catch(Exception e){
           
       }
           
        }
    public void docfile(String filename) throws FileNotFoundException, IOException, ClassNotFoundException{
            try{ 
            FileInputStream fin =new FileInputStream(filename);
            ObjectInputStream obin =new ObjectInputStream(fin);           
            dsKhachhang=(ArrayList)obin.readObject();
            dsKhachhangCN=(ArrayList)obin.readObject();
            dsKhachhangDN=(ArrayList)obin.readObject();
            obin.close();//
            fin.close();
            }catch(Exception e){
                
                System.out.print("\n!!!Lỗi :"+e);
            }
        }
}
