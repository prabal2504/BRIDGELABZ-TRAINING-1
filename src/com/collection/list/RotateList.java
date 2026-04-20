package com.collection.list;

import java.util.*;

public class RotateList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(
                Arrays.asList(10, 20, 30, 40, 50)
        );

        int rotateBy = 2;

        for (int i = 0; i < rotateBy; i++) {
            int first = list.remove(0);
            list.add(first);
        }

        System.out.println("Rotated List: " + list);
    }
}