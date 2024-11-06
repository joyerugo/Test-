package org.example;

public class Product {


    private String productId = "1234";
    private String name = "Football";
    private double price = Double.parseDouble("12.50");
    private int quantity = Integer.parseInt("2");

    public Product(String productId, String name, double price, int quantity){
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

  //Getter + Setter
    public String getProductId(){
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price) {
        this.price = price;

    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;

    }

    public static void main(String[] args){

    }


}
