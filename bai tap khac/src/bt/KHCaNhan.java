/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author NCT99
 */
public class KHCaNhan extends KHACHHANG implements Serializable{
    private static final long serialVersionUID=3214567324L;
    private String soDT, soCMT, noiCap;
    private Date ngayCap;

    public KHCaNhan() {
    }

    public KHCaNhan(String soDT, String soCMT, String noiCap, Date ngayCap, String maKH, String hoTen, String diaChi) {
        super(maKH, hoTen, diaChi);
        this.soDT = soDT;
        this.soCMT = soCMT;
        this.noiCap = noiCap;
        this.ngayCap = ngayCap;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getSoCMT() {
        return soCMT;
    }

    public void setSoCMT(String soCMT) {
        this.soCMT = soCMT;
    }

    public String getNoiCap() {
        return noiCap;
    }

    public void setNoiCap(String noiCap) {
        this.noiCap = noiCap;
    }

    public Date getNgayCap() {
        return ngayCap;
    }

    public void setNgayCap(Date ngayCap) {
        this.ngayCap = ngayCap;
    }
    @Override
    public void nhap(){
        Scanner sc =new Scanner(System.in);
        
        super.nhap();
        System.out.print("\n Nhập số điện thoại khách hàng.");
        soDT=sc.nextLine();
        System.out.print("\n Nhập số chứng minh thư khách hàng.");
        soCMT=sc.nextLine();
        System.out.print("\n Nhập nơi cấp CMT khách hàng.");
        noiCap=sc.nextLine();
        String day;
        String[] arrday=new String[3];
      //lưu trữ giá trị kiểm tra tính hợp lệ ngày nhập ,=1 thì nhập đúng ngày.
       boolean NgayThangNam=false;
        do{
            do{
                System.out.print("\n nhập ngày cấp (dd/mm/yyyy):");
                day=sc.nextLine();
                if(day.split("/").length!=3)
                System.out.print("\n!!!!Bạn đã nhập ngày tháng sai !!!!."); 
            }while( day.split("/").length!=3);         
            arrday=day.split("/");
            NgayThangNam=NgayHopLe(Integer.valueOf(arrday[0]), Integer.valueOf(arrday[1]), Integer.valueOf(arrday[2]));

            if(NgayThangNam==false)
                System.out.print("\n  !!!!!! ngày tháng năm không chính xác. !!!!!! ");
        }while(NgayThangNam==false);

        ngayCap=new Date(Integer.valueOf(arrday[2]),Integer.valueOf(arrday[1]),
                Integer.valueOf(arrday[0]));
        
    }
      public boolean NamNhuan(int year)
    {
         return(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }

    public boolean NgayHopLe(int ngay, int thang,int nam)
    {
         int[] ngayTrongThang = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
         if(thang <= 0 || thang > 12)
              return false;

         //Năm nhuận tháng 2 29 ngày:
         if(NamNhuan(nam))
              ngayTrongThang[1]++;
         if(nam<=0)
             return false;

         return (ngay > 0 && ngay <= ngayTrongThang[thang - 1]);
    }
    @Override
    public void xuat(){
        System.out.printf("\n%-7s%-25s%-25s%-14s%-15s%-2d/%-2d/%-4d%4s%-20s",this.getMaKH(),this.getHoTen(),this.getDiaChi(),
                this.getSoDT(),this.getSoCMT(),ngayCap.getDate(),
                (ngayCap.getMonth()==0)?12:ngayCap.getMonth(),
                (ngayCap.getMonth()==0)?ngayCap.getYear()-1:ngayCap.getYear()," ",this.getNoiCap());
    }
    @Override
    public String toString() {
        return "Loại KH:"+"Khách hàng cá nhân ," +super.toString()+ "Số ĐT=" + soDT + ", Số CMt=" + soCMT + ", Nơi Cấp=" + noiCap + ", Ngày Cấp=" + ngayCap;
    }
    
}
