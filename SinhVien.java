/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaysv;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author DINH CHAU
 */
public class SinhVien {
    private String MaSV;
    private String  HoTen;
    private LocalDate NamSinh;
    
    public SinhVien(){}

    public SinhVien(String MaSV, String HoTen, LocalDate NamSinh) {
        this.MaSV = MaSV;
        this.HoTen = HoTen;
        this.NamSinh = NamSinh;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public LocalDate getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(LocalDate NamSinh) {
        this.NamSinh = NamSinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "MaSV=" + MaSV + ", HoTen=" + HoTen + ", NamSinh=" + NamSinh + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SinhVien other = (SinhVien) obj;
        return Objects.equals(this.MaSV, other.MaSV);
    }
    
    
}
