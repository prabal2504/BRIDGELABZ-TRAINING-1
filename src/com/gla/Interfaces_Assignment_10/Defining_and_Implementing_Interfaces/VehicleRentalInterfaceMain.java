package com.gla.Interfaces_Assignment_10.Defining_and_Implementing_Interfaces;

interface Vehicle {
    void rent();
    void returnVehicle();
}

class Car implements Vehicle {

    public void rent() {
        System.out.println("com.gla.Interfaces_Assignment_10.Defining_and_Implementing_Interfaces.Car rented");
    }

    public void returnVehicle() {
        System.out.println("com.gla.Interfaces_Assignment_10.Defining_and_Implementing_Interfaces.Car returned");
    }
}

class Bike implements Vehicle {

    public void rent() {
        System.out.println("com.gla.Interfaces_Assignment_10.Defining_and_Implementing_Interfaces.Bike rented");
    }

    public void returnVehicle() {
        System.out.println("com.gla.Interfaces_Assignment_10.Defining_and_Implementing_Interfaces.Bike returned");
    }
}

class Bus implements Vehicle {

    public void rent() {
        System.out.println("com.gla.Interfaces_Assignment_10.Defining_and_Implementing_Interfaces.Bus rented");
    }

    public void returnVehicle() {
        System.out.println("com.gla.Interfaces_Assignment_10.Defining_and_Implementing_Interfaces.Bus returned");
    }
}

public class VehicleRentalInterfaceMain {
    public static void main(String[] args) {

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        Vehicle v3 = new Bus();

        v1.rent();
        v2.rent();
        v3.rent();

        v1.returnVehicle();
        v2.returnVehicle();
        v3.returnVehicle();
    }
}