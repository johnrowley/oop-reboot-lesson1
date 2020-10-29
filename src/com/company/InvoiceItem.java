package com.company;

public class InvoiceItem {
    private String name;
    private int quantity;
    private int price;

    public InvoiceItem(String _name) {
        name = _name;
    }

    // Alternative constructor - we want to use a different set of arguments
    // this is known as overloading - same methodName but different signature
    public InvoiceItem(String _name, int _price, int _quantity) {
        name = _name;
        price = _price;
        quantity = _quantity;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {

        return String.format("Invoice Item Details: " + name + "| Price: " + price + "| Quantity: " + quantity);

    }

}
