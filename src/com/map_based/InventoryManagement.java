package com.map_based;
import java.util.*;

public class InventoryManagement {
    public static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>();

        // Add products
        inventory.put("Rice", 50);
        inventory.put("Sugar", 30);
        inventory.put("Milk", 20);

        // Customer buys
        inventory.put("Sugar", inventory.get("Sugar") - 30);

        if (inventory.get("Sugar") <= 0) {
            inventory.put("Sugar", 0);
        }

        // New shipment arrives
        inventory.put("Milk", inventory.get("Milk") + 15);

        // Query product
        String product = "Rice";
        if (inventory.containsKey(product)) {
            System.out.println(product + " stock: " + inventory.get(product));
        } else {
            System.out.println("Not stocked");
        }

        // Out of stock products
        System.out.println("Out of stock products:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() == 0) {
                System.out.println(entry.getKey());
            }
        }
    }
}