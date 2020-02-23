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
public class KiSu extends Nguoi implements Serializable{
    private static final long serialVersionUID=3802938102L;
    private String bangCap;

    public KiSu() {
    }

    public KiSu(String bangCap, int MaNguoi, int namSinh, int soNamCongTac, String hoTen,
            String diaChi, float heSoLuong, double phuCap) {
        super(MaNguoi, namSinh, soNamCongTac, hoTen, diaChi, heSoLuong, phuCap);
        this.bangCap = bangCap;
    }

    public String getBangCap() {
        return bangCap;
    }

    public void setBangCap(String bangCap) {
        this.bangCap = bangCap;
    }
    
    
}
