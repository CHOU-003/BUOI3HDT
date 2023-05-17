/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chaysv;


import java.util.Scanner;
/**
 *
 * @author DINH CHAU
 */
public class ChaySV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSV dv = new DanhSachSV();
        
        int chon = 0;
        
        do {
            System.out.println("-----------DANH SACH THUC PHAM----------");
            System.out.println("Chon chuc nang");
            System.out.println("0. Thoat khoi man hinh nhap.\n"
            + "1. Them Sinh Vien vao danh sach.\n"
            + "2. Xuat danh sach sinh vien.\n"
            + "3. Xoa sinh vien khoi danh sach. \n"
            + "4. Sap xep sinh vien tang dan theo ma sinh vien.\n"
            + "5. Chinh sua sinh vien theo ma sinh vien.\n"
            + "6. Tim kiem sinh vien trong danh sach theo ma sinh vien. \n");
            System.out.print("Lua chon cua ban la: ");
          chon = sc.nextInt();
          sc.nextLine();
          
          if(chon == 0){}
          else if(chon ==1){     
              dv.Nhap(chon);
          }
          else if(chon ==2){
              dv.Xuat();
          }    
          else if(chon ==3){
              System.out.print("Nhap vao sinh vien ma ban muon xoa: ");
              String MaSV = sc.nextLine();//sc.nextLine();
              SinhVien sv = new SinhVien();
              System.out.println("Xoa thuc pham: " + dv.XoaSV(MaSV));
              dv.Xuat();
          }
          else if(chon ==4){
              dv.SapXep();
          }
          else if(chon ==5){
             dv.ChinhSuaTP();
          }
          else if(chon ==6){
              System.out.print("Nhap ma sinh vien muon tim: "); String MaSV = sc.next();
              System.out.println("Sinh vien tim duoc la: ");
              dv.TimKiem(MaSV);
          }
          
        } while (chon !=0);

    }
    
    
}
    
