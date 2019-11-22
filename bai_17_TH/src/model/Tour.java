/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author NCT99
 */
public class Tour implements Serializable{
    private static final long serialVersionUID=123456L;
    private int maTour=1000;
    private String kieuTour;
    private String thongTinTour;
    private double donGia;
    enum eKieuTour{
        _1_Ngay(1),
        _duoi_5_ngay(2),
        _duoi_7_ngay(3),
        _dai_ngay(4);
        private int value;
        private eKieuTour(int value) {
            this.value = value;
        }
//        for (eKieuTour s : eKieuTour.values()) {   //vd duyệt enum
//            System.out.println(s + " " + s.value);
//        }
    }

    public Tour() {
    }

    public Tour(String kieuTour, String thongTinTour, double donGia) {
        this.kieuTour = kieuTour;
        this.thongTinTour = thongTinTour;
        this.donGia = donGia;
    }

    public int getMaTour() {
        return maTour;
    }

    public void setMaTour(int maTour) {
        this.maTour = maTour;
    }

    

    public String getKieuTour() {
        return kieuTour;
    }

    public void setKieuTour(String kieuTour) {
        this.kieuTour = kieuTour;
    }

    public String getThongTinTour() {
        return thongTinTour;
    }

    public void setThongTinTour(String thongTinTour) {
        this.thongTinTour = thongTinTour;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
}
