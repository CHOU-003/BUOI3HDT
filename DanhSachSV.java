/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaysv;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author DINH CHAU
 */
public class DanhSachSV {
    Scanner sc = new Scanner(System.in);
    ArrayList<SinhVien> ds = new ArrayList<>();
    
    
     public void Nhap(int n) {
    int input;
    for(int i=0; i<n;i++) {
        System.out.println("0. THOAT !!!");
        System.out.println("1. Nhap CD vao danh sach.");
        input = sc.nextInt();
        sc.nextLine();
        if (input == 1) {
            System.out.print("Nhap MaSV: ");
            String MaSV = sc.nextLine();

            System.out.print("Nhap ho ten: ");
            String hoTen = sc.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            System.out.print("Nhap nam sinh (dd-MM-yyyy): ");
            String namSinhStr = sc.nextLine();

            LocalDate namSinh = LocalDate.parse(namSinhStr, formatter);
            SinhVien sv = new SinhVien(MaSV, hoTen, namSinh);
            ds.add(sv);
        } else if (input == 0) {
            break;
        } else {
            System.out.println("Nhap sai, vui long nhap lai!");
            i--;
        }
    }
    }
    
    public void Xuat(){
        for(SinhVien sv : ds){
            System.out.println(sv.toString());
        }
    }
    
    public boolean XoaSV(String Masv){
        for(SinhVien sv : ds){
            if(sv.getMaSV().equals(Masv)){
                return this.ds.remove(sv);
            }
        }
        return false; 
    }
    
    public void ChinhSuaTP(){
        String Masv;
        int index = -1;
        System.out.print("Nhap ma sinh vien can chinh sua: ");
        Masv = sc.nextLine();
    for (int i = 0; i < ds.size(); i++) {
        if(ds.get(i).getMaSV().equals(Masv)){
            index = i;
            break;
        }
    }
    if(index==-1){
        System.out.println("Khong tim thay sinh vien !");
        return;
    }
    System.out.println("Ban dang chinh sua sinh vien co ma: "+ds.get(index).getMaSV());
    System.out.println("Ban co muon chinh sua thong tin khong?");
    System.out.println("1. Co");
    System.out.println("2. Khong");
    int chonTuChoi = sc.nextInt(); sc.nextLine();
    if(chonTuChoi == 2) return;

    System.out.println("Thong tin sinh vien can chinh sua: "+ ds.get(index).toString());

    System.out.println("Nhap thong tin moi: ");
    System.out.print("Nhap ho ten: ");ds.get(index).setHoTen(sc.nextLine());
    System.out.print("Nhap ngay sinh dd-mm-yyyy: ");
    String dateStr = sc.nextLine();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    LocalDate namSinh = LocalDate.parse(dateStr, formatter);

// Cập nhật trường NamSinh của đối tượng tại vị trí index
ds.get(index).setNamSinh(namSinh);

    System.out.println("Thong tin sinh vien sau khi chinh sua: "+ ds.get(index).toString());
    }
    
    public void TimKiem(String Masv){
        for(SinhVien sv : ds){
            if(sv.getMaSV().indexOf(Masv) >= 0){
                System.out.println(sv);
            }
        }
    }
    
    public void SapXep(){
    Collections.sort(ds, new Comparator<SinhVien>() {
        @Override
        public int compare(SinhVien sv1, SinhVien sv2) {
            return sv1.getMaSV().compareTo(sv2.getMaSV());
        }
    });

    System.out.println("Danh sach sau khi sap xep: ");
    Xuat();
    }


}
