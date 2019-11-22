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
public class KhachHang implements Serializable{
    private static final long serialVersionUID=123456345L;
    private int maKH=100;
    private String tenKH;
    private String kieuKH;
    public KhachHang() {
    }
    
    public KhachHang(String tenKH, String kieuKH) {
        this.tenKH = tenKH;
        this.kieuKH = kieuKH;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    
    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getKieuKH() {
        return kieuKH;
    }

    public void setKieuKH(String kieuKH) {
        this.kieuKH = kieuKH;
    }
    enum eKieuKH{
        CaNhan(1),
        TapThe(2);
        private int value;
        private eKieuKH(int value) {
            this.value = value;
        }
    }
    
    
}
