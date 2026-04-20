package com.map_based;
import java.util.*;

public class BankingSystem {

    public static void main(String[] args) {

        Map<String, Double> accounts = new HashMap<>();

        // Add accounts
        accounts.put("A101", 5000.0);
        accounts.put("A102", 8000.0);
        accounts.put("A103", 3000.0);

        // Deposit
        accounts.put("A101", accounts.get("A101") + 2000);

        // Withdrawal
        double withdraw = 1000;
        if (accounts.get("A102") >= withdraw) {
            accounts.put("A102", accounts.get("A102") - withdraw);
        }

        // Print all sorted by balance (descending)
        List<Map.Entry<String, Double>> list = new ArrayList<>(accounts.entrySet());

        list.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

        System.out.println("Sorted Accounts:");
        for (Map.Entry<String, Double> e : list) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // Top customer
        System.out.println("Top Customer: " + list.get(0).getKey());
    }
}