package com.gla.Interfaces_Assignment_10.Functional_Interface;

import java.util.function.Function;

public class StringLengthCheckerMain {
    public static void main(String[] args) {
        Function<String, Integer> length = s -> s.length();
        System.out.println(length.apply("Hello"));
    }
}