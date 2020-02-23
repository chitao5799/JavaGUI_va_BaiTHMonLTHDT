/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi;

import com.sun.xml.internal.stream.Entity;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author NCT99
 */
public class nganhang implements Serializable{
        private static final long serialVersionUID=3214567324L;

    private String maNH,tenNH;
    private double laiXuat;

    public nganhang() {
    }

    public nganhang(String maNH, String tenNH, double laiXuat) {
        this.maNH = maNH;
        this.tenNH = tenNH;
        this.laiXuat = laiXuat;
    }

    public String getMaNH() {
        return maNH;
    }

    public void setMaNH(String maNH) {
        this.maNH = maNH;
    }

    public String getTenNH() {
        return tenNH;
    }

    public void setTenNH(String tenNH) {
        this.tenNH = tenNH;
    }

    public double getLaiXuat() {
        return laiXuat;
    }

    public void setLaiXuat(double laiXuat) {
        this.laiXuat = laiXuat;
    }
    public void nhap(){
        Scanner sc =new Scanner(System.in);
        System.out.print("\n Nhập mã ngân hàng:");
        maNH=sc.nextLine();
        System.out.print("\n Nhập  tên ngân hàng:");
        tenNH=sc.nextLine();
        System.out.print("\n Nhập lãi xuất tiền gửi ngân hàng:");
        laiXuat=sc.nextDouble(); 
    }
    public void xuat(){
        System.out.printf("\n%-10s%-20s%-10.2f",maNH,tenNH,laiXuat);
    }
}
