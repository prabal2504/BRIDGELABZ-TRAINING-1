package com.gla.Interfaces_Assignment_10.Defining_and_Implementing_Interfaces;

interface SmartDevice {
    void turnOn();
    void turnOff();
}
class Light implements SmartDevice {
    public void turnOn() {
        System.out.println("com.gla.Interfaces_Assignment_10.Defining_and_Implementing_Interfaces.com.gla.Interfaces_Assignment_10.Defining_and_Implementing_Interfaces.Light is turned ON");
    }
    public void turnOff() {
        System.out.println("com.gla.Interfaces_Assignment_10.Defining_and_Implementing_Interfaces.com.gla.Interfaces_Assignment_10.Defining_and_Implementing_Interfaces.Light is turned OFF");
    }
}
class AC implements SmartDevice {
    public void turnOn() {
        System.out.println("com.gla.Interfaces_Assignment_10.Defining_and_Implementing_Interfaces.com.gla.Interfaces_Assignment_10.Defining_and_Implementing_Interfaces.AC is turned ON");
    }
    public void turnOff() {
        System.out.println("com.gla.Interfaces_Assignment_10.Defining_and_Implementing_Interfaces.com.gla.Interfaces_Assignment_10.Defining_and_Implementing_Interfaces.AC is turned OFF");
    }
}
class TV implements SmartDevice {
    public void turnOn() {
        System.out.println("com.gla.Interfaces_Assignment_10.Defining_and_Implementing_Interfaces.com.gla.Interfaces_Assignment_10.Defining_and_Implementing_Interfaces.TV is turned ON");
    }
    public void turnOff() {
        System.out.println("com.gla.Interfaces_Assignment_10.Defining_and_Implementing_Interfaces.com.gla.Interfaces_Assignment_10.Defining_and_Implementing_Interfaces.TV is turned OFF");
    }
}
public class SmartDeviceMain {
    public static void main(String[] args) {
        SmartDevice light = new Light();
        SmartDevice ac = new AC();
        SmartDevice tv = new TV();
        light.turnOn();
        ac.turnOn();
        tv.turnOn();
        light.turnOff();
        ac.turnOff();
        tv.turnOff();
    }
}