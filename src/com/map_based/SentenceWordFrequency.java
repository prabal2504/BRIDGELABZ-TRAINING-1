package com.map_based;
import java.util.*;

public class SentenceWordFrequency {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";

        sentence = sentence.toLowerCase().replaceAll("[^a-zA-Z ]", "");

        String[] words = sentence.split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequency:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}