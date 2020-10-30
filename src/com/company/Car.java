package com.company;

public class Car {

    private String manufacturer;

    private int passengerCount = 0;

    // Constructor - gets called (or invoked) when you create instance of the class
    // Always has the same name as the class
    public Car(String _manufacturer) {
        manufacturer = _manufacturer;
        System.out.println("Car is created");

    }

    public void setPassengerCount(int _count) {
        passengerCount = _count;
    }

    public int getPassengerCount() {
        return passengerCount;
    }
    // getter Method - allows you to retrieve the value of a private variable
    // You are controlling outside access to the members of your class
    public String getManufacturer() {
        return manufacturer;
    }
    @Override
    public String toString() {

        return String.format("Manufacturer: " + manufacturer);
    }
}
