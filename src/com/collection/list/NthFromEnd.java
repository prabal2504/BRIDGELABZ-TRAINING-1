package com.collection.list;

import java.util.*;

public class NthFromEnd {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>(
                Arrays.asList("A", "B", "C", "D", "E")
        );

        int n = 2;

        int first = 0;
        int second = n;

        while (second < list.size()) {
            first++;
            second++;
        }

        System.out.println("Nth element from end: " + list.get(first));
    }
}