package com.gla.Interfaces_Assignment_10.Functional_Interface;

import java.util.function.Predicate;

public class TemperatureAlertMain {
    public static void main(String[] args) {
        Predicate<Double> alert = t -> t > 40;
        System.out.println(alert.test(45.0));
    }
}