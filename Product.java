/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testpro;

/**
 *
 * @author DINH CHAU
 */
public class Product {
    private String description;
    private String proID;
    private double price;
    
    public Product(){}

    public Product(String description, String proID, double price) {
        this.description = description;
        this.proID = proID;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProID() {
        return proID;
    }

    public void setProID(String proID) {
        this.proID = proID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "description=" + description + ", proID=" + proID + ", price=" + price + '}';
    }
    
    
}
