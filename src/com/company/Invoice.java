package com.company;

import java.util.ArrayList;

public class Invoice {

    private String number;

    ArrayList<InvoiceItem> listOfInvoiceItems = new ArrayList<InvoiceItem>();

    public Invoice(String _number) {

        number = _number;

    }

    public void addInvoiceItem(InvoiceItem itemToAdd) {

        listOfInvoiceItems.add(itemToAdd);
    }


    public ArrayList<InvoiceItem> getListOfInvoiceItems() {
        return listOfInvoiceItems;
    }

    public int getTotalValue() {
        int totalValue = 0;

        for(InvoiceItem currentItem:listOfInvoiceItems) {

            totalValue += currentItem.getTotalValue();

        }

        return totalValue;

    }

    public String getNumber() {
        return "1234";
    }

    @Override
    public String toString() {

        // Formatted string, using placeolders %d means it expects a number, %s means it expects a name
        return String.format("This is Invoice %s. It has %d items" , number, listOfInvoiceItems.size());
    }
}
