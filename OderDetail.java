/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testpro;

import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author DINH CHAU
 */
public class OderDetail extends Product{
    private int quably;
    private Product product;

    public OderDetail(int quably, Product product) {
        super();
        this.quably = quably;
        this.product = product;
    }

    public int getQuably() {
        return quably;
    }

    public void setQuably(int quably) {
        this.quably = quably;
    }

    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setGroupingUsed(true);
        String dongia = nf.format(product.getPrice());
        String thanhtien = nf.format(calcTotalPrice());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return String.format("| %-15s | %-25s | %-15d | %-20s | %-10s |%n", product.getProID(),
                product.getDescription(), quably,dongia, thanhtien);
    }    
    
    public double calcTotalPrice(){
        double ThanhTien = this.getQuably() * this.product.getPrice();
        
        return  ThanhTien;
    }

    void add(OderDetail oderDetail) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getProduct() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
