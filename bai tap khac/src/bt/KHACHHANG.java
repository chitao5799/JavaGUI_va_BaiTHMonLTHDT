/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author NCT99
 */
public class KHACHHANG implements Serializable{
    private static final long serialVersionUID=3214567L;
    private String maKH,hoTen,diaChi ;

    public KHACHHANG() {
    }

    public KHACHHANG(String maKH, String hoTen, String diaChi) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void nhap(){
        Scanner sc =new Scanner(System.in);
        System.out.print("\n Nhập mã khách hàng:");
        maKH=sc.nextLine();
        System.out.print("\n Nhập họ tên khách hàng:");
        hoTen=sc.nextLine();
        System.out.print("\n Nhập địa chỉ khách hàng:");
        diaChi=sc.nextLine(); 
    }
    public void xuat(){
        
    }

    @Override
    public String toString() {//"KHACHHANG:" +
        return  " Mã KH=" + maKH + ", Họ Tên=" + hoTen + ", Địa Chỉ=" + diaChi;
    }
    
}
