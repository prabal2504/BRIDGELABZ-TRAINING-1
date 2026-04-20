package com.map_based;
import java.util.*;

public class ShoppingCart {

    public static void main(String[] args) {

        Map<String, Double> cart = new LinkedHashMap<>();

        cart.put("Laptop", 50000.0);
        cart.put("Mouse", 500.0);
        cart.put("Keyboard", 1500.0);

        // Total bill
        double total = 0;

        for (double price : cart.values()) {
            total += price;
        }

        System.out.println("Total: " + total);

        // Discount
        if (total > 5000) {
            total = total * 0.9;
            System.out.println("After discount: " + total);
        }
    }
}