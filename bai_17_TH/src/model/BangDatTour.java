/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author NCT99
 */
public class BangDatTour implements Serializable{
    private static final long serialVersionUID=128923456L;
    private Date ngayBatDau; // dd/mm/yyyy
    private int maTour,maKH;
    private int soLuongNguoi=1;
    private String kieuTour,kieuKH ;
    private  double thanhTien;
    private int intKieuTour,intKieuKH;
    public BangDatTour() {
        this.intKieuTour=0;this.intKieuKH=0;
    }

    public BangDatTour(Date ngayBatDau, int maTour, int maKH) {
        this.ngayBatDau = ngayBatDau;
        this.maTour = maTour;
        this.maKH = maKH;
    }

    public int getIntKieuTour() {
        return intKieuTour;
    }

    public void setIntKieuTour(int intKieuTour) {
        this.intKieuTour = intKieuTour;
    }

    public int getIntKieuKH() {
        return intKieuKH;
    }

    public void setIntKieuKH(int intKieuKH) {
        this.intKieuKH = intKieuKH;
    }
    
    public String getKieuTour() {
        return kieuTour;
    }

    public void setKieuTour(String kieuTour) {
        this.kieuTour = kieuTour;
    }

    public String getKieuKH() {
        return kieuKH;
    }

    public void setKieuKH(String kieuKH) {
        this.kieuKH = kieuKH;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
    
    public int getSoLuongNguoi() {
        return soLuongNguoi;
    }

    public void setSoLuongNguoi(int soLuongNguoi) {
        this.soLuongNguoi = soLuongNguoi;
    }
    
    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public int getMaTour() {
        return maTour;
    }

    public void setMaTour(int maTour) {
        this.maTour = maTour;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }
    
    
}

