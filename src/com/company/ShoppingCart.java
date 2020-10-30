package com.company;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Product> products = new ArrayList<Product>();

    public ShoppingCart() {

    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public double getTotalValue() {
        double totalPrice = 0;
        for(Product currentProduct:products) {
            totalPrice += currentProduct.getTotalValue();
        }
        return totalPrice;
    }

    public String showReceiptItems() {

        StringBuilder receipt = new StringBuilder();

        for(Product currentProduct:products) {
          receipt.append(String.format("%s ----%d----[%f]\n",currentProduct.getName(), currentProduct.getQuantity(), currentProduct.getTotalValue()));
        }

       return receipt.toString();
    }
}
