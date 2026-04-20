package com.generics;

import java.util.*;

class Vehicle {
    String name;

    Vehicle(String name) {
        this.name = name;
    }
}

class Truck extends Vehicle {
    Truck(String name) {
        super(name);
    }
}

class Bike extends Vehicle {
    Bike(String name) {
        super(name);
    }
}

public class FleetManager<T extends Vehicle> {
    List<T> fleet = new ArrayList<>();

    public void addVehicle(T vehicle) {
        fleet.add(vehicle);
    }

    public void showFleet() {
        for (T vehicle : fleet) {
            System.out.println(vehicle.name);
        }
    }

    public static void main(String[] args) {
        FleetManager<Truck> trucks = new FleetManager<>();
        trucks.addVehicle(new Truck("Truck A"));
        trucks.addVehicle(new Truck("Truck B"));
        trucks.showFleet();

        FleetManager<Bike> bikes = new FleetManager<>();
        bikes.addVehicle(new Bike("Bike X"));
        bikes.showFleet();
    }
}