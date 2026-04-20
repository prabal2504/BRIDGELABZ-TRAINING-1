package com.map_based;
import java.util.*;

public class WordFrequencyAdvanced {

    public static void main(String[] args) {

        String text = "Java is fun and Java is powerful and Java is easy";

        Map<String, Integer> freq = new HashMap<>();

        String[] words = text.toLowerCase().split(" ");

        for (String w : words) {
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }

        System.out.println("Word Frequency:");

        for (Map.Entry<String, Integer> e : freq.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // Most frequent word
        String maxWord = "";
        int maxCount = 0;

        for (String w : freq.keySet()) {
            if (freq.get(w) > maxCount) {
                maxCount = freq.get(w);
                maxWord = w;
            }
        }

        System.out.println("Most Frequent: " + maxWord);
    }
}