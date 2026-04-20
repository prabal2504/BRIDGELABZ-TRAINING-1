package com.map_based;
import java.util.*;

public class OnlineShoppingCart {
    public static void main(String[] args) {
        Map<String, Double> cart = new LinkedHashMap<>();

        cart.put("Laptop", 45000.0);
        cart.put("Mouse", 800.0);
        cart.put("Keyboard", 1500.0);
        cart.put("Headphones", 2500.0);

        double total = 0;

        System.out.println("Products in Cart:");
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " : ₹" + entry.getValue());
            total += entry.getValue();
        }

        if (total > 5000) {
            total = total - (total * 0.10);
        }

        cart.remove("Mouse");

        System.out.println("Final Bill: ₹" + total);
    }
}