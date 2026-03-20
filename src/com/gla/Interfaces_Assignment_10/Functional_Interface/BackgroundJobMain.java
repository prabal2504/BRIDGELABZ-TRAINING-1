package com.gla.Interfaces_Assignment_10.Functional_Interface;

public class BackgroundJobMain {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Task running");
        new Thread(r).start();
    }
}