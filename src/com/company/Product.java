package com.company;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String _name) {
        name = _name;
    }


    public String getName() {
        return name;
    }

    public void setName(String _name) {
        name = _name;
    }


    public double getPrice() {
        return price;
    }

    public double getTotalValue() {
        return price * quantity;
    }


    public void setPrice(double _price) {
        price = _price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int _quantity) {
        quantity = _quantity;
    }
}
