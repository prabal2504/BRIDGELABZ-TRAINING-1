package com.setinterface;

import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        System.out.println("Original Set: " + set);
        System.out.println("Sorted List: " + list);
    }
}