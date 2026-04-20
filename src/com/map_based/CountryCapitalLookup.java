package com.map_based;
import java.util.*;

public class CountryCapitalLookup {
    public static void main(String[] args) {
        Map<String, String> capitals = new TreeMap<>();

        capitals.put("India", "New Delhi");
        capitals.put("Japan", "Tokyo");
        capitals.put("France", "Paris");
        capitals.put("Germany", "Berlin");
        capitals.put("Canada", "Ottawa");
        capitals.put("China", "Beijing");
        capitals.put("Brazil", "Brasilia");
        capitals.put("Australia", "Canberra");

        String country = "India";

        if (capitals.containsKey(country)) {
            System.out.println("Capital: " + capitals.get(country));
        } else {
            System.out.println("Unknown country");
        }

        System.out.println("All Countries:");
        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}