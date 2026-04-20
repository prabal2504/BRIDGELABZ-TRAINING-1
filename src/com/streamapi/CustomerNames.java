package com.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class CustomerNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("rahul", "priya", "aman");

        List<String> result = names.stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}