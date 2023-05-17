/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testpro;

import java.time.LocalDate;

/**
 *
 * @author DINH CHAU
 */
public class TESTPRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Order or = new Order(1, LocalDate.of(2015, 9, 10));
       
       or.Nhap(5);
       or.xuatHang();
       or.calcTotalCharge();
             
    }
    
}
