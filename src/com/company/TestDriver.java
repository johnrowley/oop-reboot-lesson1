package com.company;

import java.util.ArrayList;

public class TestDriver {
    public static void run() {

        //  testPerson();
        //   testShop();
        //  testCar();

        testInvoice();
        ///  testInvoiceItem();
        testStreet();

    }

    private static void testStreet() {

        Street street = new Street("Dame Street");

        Car car1 = new Car("Volvo");
        car1.setPassengerCount(4);

        Car car2 = new Car("BMW");
        car2.setPassengerCount(2);

        street.addCar(car1);
        street.addCar(car2);


        System.out.println(street.toString());


        ArrayList<Car> carsOnStreet = street.getCars();

        // for loop, state the type of Object, assign a variable to track current item : from the list
        for (Car currentCar : carsOnStreet) {

            String message = String.format("The car on the street is %s", currentCar.toString());
            System.out.println(message);
        }

        String message = String.format("Total passengers in cars  on the street is %d", street.getTotalPassengers());
        System.out.println(message);


    }

    private static void testInvoice() {

        Invoice invoice = new Invoice("1234");

        InvoiceItem item1 = new InvoiceItem("Apple", 5,10);
        InvoiceItem item2 = new InvoiceItem("Orange", 6,7);
        InvoiceItem item3 = new InvoiceItem("Pear", 8, 9);

        invoice.addInvoiceItem(item1);
        invoice.addInvoiceItem(item2);
        invoice.addInvoiceItem(item3);
        System.out.println(invoice.toString());


        ArrayList<InvoiceItem> itemsOnInvoice = invoice.getListOfInvoiceItems();

        for(InvoiceItem currentItem:itemsOnInvoice) {

            String message = String.format("The item is %s", currentItem.toString());
            System.out.println(message);

        }

        System.out.println(String.format("Total value is %d", invoice.getTotalValue()));

    }

    private static void testInvoiceItem() {
        InvoiceItem i = new InvoiceItem("apple");
        System.out.println("InvoiceItem is " + i.getName());

        InvoiceItem item2 = new InvoiceItem("orange", 3, 4);
        System.out.println(item2.toString());


    }

    public static void testPerson() {
        Person p = new Person("Dorset Man"); // create an instance of the class => it becomes an object


        System.out.println("The person is " + p.getName());
        p.setAge(1050);
        System.out.println("The age is " + p.getAge());

    }

    public static void testCar() {
        Car c = new Car("Volvo");

        //System.out.println("The manufacturer is " + c.getManufacturer());
        System.out.println(c.toString());

        Car c2 = new Car("BMW");
        // System.out.println("The manufacturer is " + c2.getManufacturer());
        System.out.println(c2.toString());
    }

    public static void testShop() {
        Shop s = new Shop("Centra");
        System.out.println("The shop is " + s.getName());

        System.out.println(s.toString());

    }

}
