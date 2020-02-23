/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author NCT99
 */
public class Nguoi implements Serializable{
    private static final long serialVersionUID=234571L;
    private int MaNguoi,namSinh,soNamCongTac;
    private String hoTen,diaChi ;
    private static double luongCoBan=450000; 
    private float heSoLuong;
    private double phuCap;
    private double luong;
    public Nguoi() {
    }
    
    public Nguoi(int MaNguoi, int namSinh, int soNamCongTac, String hoTen, String diaChi, float heSoLuong, double phuCap) {
        this.MaNguoi = MaNguoi;
        this.namSinh = namSinh;
        this.soNamCongTac = soNamCongTac;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.heSoLuong = heSoLuong;
        this.phuCap = phuCap;
    }

    public int getMaNguoi() {
        return MaNguoi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    public void setMaNguoi(int MaNguoi) {
        this.MaNguoi = MaNguoi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public int getSoNamCongTac() {
        return soNamCongTac;
    }

    public void setSoNamCongTac(int soNamCongTac) {
        this.soNamCongTac = soNamCongTac;
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

    public static double getLuongCoBan() {
        return luongCoBan;
    }

    public static void setLuongCoBan(double luongCoBan) {
        Nguoi.luongCoBan = luongCoBan;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }
    
}
