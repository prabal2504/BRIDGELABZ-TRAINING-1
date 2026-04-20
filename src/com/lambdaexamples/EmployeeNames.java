package com.lambdaexamples;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeNames {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "rahul", "priya", "aman"
        );

        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperNames);
    }
}