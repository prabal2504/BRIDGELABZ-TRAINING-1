package com.gla.Interfaces_Assignment_10.Default_Methods;

interface PaymentProcessor {

    void pay(double amount);

    default void refund(double amount) {
        System.out.println("Refund processed: " + amount);
    }
}

class PayPal implements PaymentProcessor {

    public void pay(double amount) {
        System.out.println("Paid using com.gla.Interfaces_Assignment_10.Default_Methods.PayPal: " + amount);
    }
}

public class PaymentProcessorMain {
    public static void main(String[] args) {
        PayPal p = new PayPal();
        p.pay(500);
        p.refund(200);
    }
}