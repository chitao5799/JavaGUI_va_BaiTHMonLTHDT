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
public class KHDoanhNgiep extends KHACHHANG implements Serializable{
    private static final long serialVersionUID=30184214567L;
    private String eMail,noiDangKy, maSoThue;
    private int soDKKinhDoanh;
    private Date ngayDangKY;

    public KHDoanhNgiep() {
    }

    public KHDoanhNgiep(String eMail, String noiDangKy, String maSoThue, int soDKKinhDoanh, Date ngayDangKY, String maKH, String hoTen, String diaChi) {
        super(maKH, hoTen, diaChi);
        this.eMail = eMail;
        this.noiDangKy = noiDangKy;
        this.maSoThue = maSoThue;
        this.soDKKinhDoanh = soDKKinhDoanh;
        this.ngayDangKY = ngayDangKY;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getNoiDangKy() {
        return noiDangKy;
    }

    public void setNoiDangKy(String noiDangKy) {
        this.noiDangKy = noiDangKy;
    }

    public String getMaSoThue() {
        return maSoThue;
    }

    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }

    public int getSoDKKinhDoanh() {
        return soDKKinhDoanh;
    }

    public void setSoDKKinhDoanh(int soDKKinhDoanh) {
        this.soDKKinhDoanh = soDKKinhDoanh;
    }

    public Date getNgayDangKY() {
        return ngayDangKY;
    }

    public void setNgayDangKY(Date ngayDangKY) {
        this.ngayDangKY = ngayDangKY;
    }
    @Override
    public void nhap(){
        Scanner sc =new Scanner(System.in);
        super.nhap();
        System.out.print("\n Nhập email cho doanh nghiệp:");
        eMail=sc.nextLine();
        int soDKThoaMan=1;
        do{
        try{
            System.out.print("\n Nhập số đăng ký kinh doanh cho doanh nghiệp:");
            soDKKinhDoanh=sc.nextInt();soDKThoaMan=1;
            sc.nextLine();
        }catch(Exception e){
            System.out.print("\n Nhập số đăng ký là số nguyên.");
            soDKThoaMan=-1;
            sc.nextLine();
        }
        }while(soDKThoaMan==-1);
        
         String day;
        String[] arrday=new String[3];
      //lưu trữ giá trị kiểm tra tính hợp lệ ngày nhập ,=1 thì nhập đúng ngày.
       boolean NgayThangNam=false;
        do{
            do{
                System.out.print("\n nhập ngày đăng ký:");
                day=sc.nextLine();
                if(day.split("/").length!=3)
                System.out.print("\n!!!!Bạn đã nhập ngày tháng sai !!!!."); 
            }while( day.split("/").length!=3);         
            arrday=day.split("/");
            NgayThangNam=NgayHopLe(Integer.valueOf(arrday[0]), Integer.valueOf(arrday[1]), Integer.valueOf(arrday[2]));

            if(NgayThangNam==false)
                System.out.print("\n  !!!!!! ngày tháng năm không chính xác. !!!!!! ");
        }while(NgayThangNam==false);

        ngayDangKY=new Date(Integer.valueOf(arrday[2]),Integer.valueOf(arrday[1]),
                Integer.valueOf(arrday[0]));
        
        System.out.print("\n Nhập nơi đăng ký cho doanh nghiệp:");
        noiDangKy=sc.nextLine();
        System.out.print("\n Nhập mã số thuế cho doanh nghiệp:");
        maSoThue=sc.nextLine();
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
        System.out.printf("\n %-7s%-25s%-25s%-15s%-7d%-2d/%-2d/%-4d%4s%-20s%-10s ",this.getMaKH(),this.getHoTen(),this.getDiaChi(),
                eMail,soDKKinhDoanh,ngayDangKY.getDate(),(ngayDangKY.getMonth()==0)?12:ngayDangKY.getMonth(),
                (ngayDangKY.getMonth()==0)?ngayDangKY.getYear()-1:ngayDangKY.getYear()," ",noiDangKy,maSoThue);
    }
    @Override
    public String toString() {
        return "Loại KH:"+"KH Doanh Ngiệp "+super.toString() + "eMail=" + eMail + ", nơi đăng ký=" + noiDangKy + ", mã số thuế=" + maSoThue + ", số đăng ký kinh doanh=" + soDKKinhDoanh + ", ngày đăng ký=" + ngayDangKY ;
    }
    
    
}
