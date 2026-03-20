package com.gla.Interfaces_Assignment_10.Default_Methods;

interface Vehicle {

    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery: 80%");
    }
}

class ElectricCar implements Vehicle {

    public void displaySpeed() {
        System.out.println("Speed: 60 km/h");
    }
}

public class VehicleDashboardMain {
    public static void main(String[] args) {
        ElectricCar car = new ElectricCar();
        car.displaySpeed();
        car.displayBattery();
    }
}