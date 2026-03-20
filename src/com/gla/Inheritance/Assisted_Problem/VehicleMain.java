package com.gla.Assisted_Problem;

class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Speed: " + maxSpeed);
        System.out.println("Fuel: " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Seats: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    int loadCapacity;

    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Load: " + loadCapacity);
    }
}

class Motorcycle extends Vehicle {
    boolean hasGear;

    Motorcycle(int maxSpeed, String fuelType, boolean hasGear) {
        super(maxSpeed, fuelType);
        this.hasGear = hasGear;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Gear: " + hasGear);
    }
}

public class VehicleMain {
    public static void main(String[] args) {

        Vehicle[] v = new Vehicle[3];

        v[0] = new Car(180, "Petrol", 5);
        v[1] = new Truck(120, "Diesel", 10000);
        v[2] = new Motorcycle(150, "Petrol", true);

        for (Vehicle vehicle : v) {
            vehicle.displayInfo();
            System.out.println();
        }
    }
}