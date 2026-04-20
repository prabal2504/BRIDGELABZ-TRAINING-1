package com.collection.list;

import java.util.*;

public class FrequencyElements {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList(
                "apple", "banana", "apple", "orange"
        );

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String item : fruits) {
            frequencyMap.put(
                    item,
                    frequencyMap.getOrDefault(item, 0) + 1
            );
        }

        System.out.println(frequencyMap);
    }
}