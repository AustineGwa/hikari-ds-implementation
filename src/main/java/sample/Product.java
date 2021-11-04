/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 *
 * @author hp
 */
public class Product {
    
    private String itemCode;
    private int price;

    public Product() {
    }

    public Product(String itemCode, int price) {
        this.itemCode = itemCode;
        this.price = price;
    }
    
    

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "itemCode='" + itemCode + '\'' +
                ", price=" + price +
                '}';
    }
    
}
