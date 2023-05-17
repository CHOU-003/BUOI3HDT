/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testpro;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author DINH CHAU
 */
public class Order {
    ArrayList<OderDetail> ds = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int chon = 0;
    
    private int orderID;
    private LocalDate orderDate;
    private OderDetail lineitems;

    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
    }

    Order() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public int getOrderID() {
        return orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public OderDetail getLineitems() {
        return lineitems;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" + "ds=" + ds + ", orderID=" + orderID + ", orderDate=" + orderDate + ", lineitems=" + lineitems + '}';
    }
    
    public void addLineitem(Product p, int x){
        lineitems.add(new OderDetail(x, p));
    }
    
    public double calcTotalCharge(){
    double Tong = 0.0;
    for(OderDetail item : ds){
       Tong += item.calcTotalPrice();
    }
    return Tong;
    }
    
    
    public void Nhap(int n) {
    int input;
//        System.out.println("Nhap ma HD: "); int orderID = sc.nextInt();sc.nextLine();
//        System.out.println("Nhap ngay: ");
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate orderDate = LocalDate.parse(sc.next(), formatter);

    for(int i=0; i<n;i++) {
        System.out.println("0. THOAT !!!");
        System.out.println("1. Nhap CD vao danh sach.");
        input = sc.nextInt();
        sc.nextLine();
        if (input == 1) {
            System.out.print("Nhap ma sp: ");
            String proID = sc.nextLine();
            System.out.print("Nhap ten CD: ");
            String description = sc.nextLine();
            System.out.print("Nhap gia san pham: ");
            double price = sc.nextDouble();
            System.out.print("Nhap so luong: ");
            int Quanbly = sc.nextInt();
            OderDetail ol = new OderDetail(Quanbly, new Product(proID, description, price));
            ds.add(ol);
        } else if (input == 0) {
            break;
        } else {
            System.out.println("Nhap sai, vui long nhap lai!");
            i--;
        }
    }
    }

    
    public void xuatHang() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach hang rong!");
        } else {
                System.out.println("Ma HD: " + this.orderID);
                System.out.println("Ngay Lap Hoa Don: " + this.getOrderDate());
        	 System.out.println( String.format("| %-15s | %-25s | %-15s | %-20s | %-20s | %n", "Ma SP", "Mo Ta", "Don gia",
                     "S Luong", "Thanh Tien") + 
                     "================================================================================================================================"+ "\n");
            for (OderDetail ol : ds) {
                System.out.println(ol);
            }
            System.out.println("Tong Tien Thanh Toan: " + calcTotalCharge());
        }
    }
    
    
}
