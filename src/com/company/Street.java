package com.company;

import java.util.ArrayList;

public class Street {

    private String name;
    // A list of Cars

    private ArrayList<Car> listOfCars = new ArrayList<Car>();

    public Street(String _name) {

        name = _name;
    }



    public void addCar(Car carToAdd) {

        listOfCars.add(carToAdd);
    }

    public int getTotalPassengers() {

        int totalPax = 0;

        for(Car currentCar:listOfCars) {

            totalPax += currentCar.getPassengerCount();
        }


        return totalPax;
    }



    public ArrayList<Car> getCars() {

        return listOfCars;
    }


    @Override
    public String toString() {

        // Formatted string, using placeolders %d means it expects a number, %s means it expects a name
        return String.format("This is %s street. It has %d car(s)" , name, listOfCars.size());
    }
}
