package com.collection.list;

import java.util.*;

public class ReverseList {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5)
        );

        List<Integer> linkedList = new LinkedList<>(
                Arrays.asList(1, 2, 3, 4, 5)
        );

        List<Integer> reversedArray = new ArrayList<>();
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            reversedArray.add(arrayList.get(i));
        }

        List<Integer> reversedLinked = new LinkedList<>();
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            reversedLinked.add(linkedList.get(i));
        }

        System.out.println("Reversed ArrayList: " + reversedArray);
        System.out.println("Reversed LinkedList: " + reversedLinked);
    }
}