package models;

public class ProductModel {
    public String name;

    public double price;

    public int quantity;

    public ProductModel(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void updatePrice(double price) {
        this.price = price;
    }

    public void updateName(String name) {
        this.name = name;
    }

    public void updateQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity(){return quantity;}
}
