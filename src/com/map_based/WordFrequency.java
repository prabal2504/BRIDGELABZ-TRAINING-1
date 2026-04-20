package com.map_based;

import java.util.*;

public class WordFrequency {

    public static void main(String[] args) {

        String text = "Hello world hello Java";

        Map<String, Integer> freq = new HashMap<>();

        String[] words = text.toLowerCase().split(" ");

        for (String w : words) {
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }

        System.out.println(freq);
    }
}