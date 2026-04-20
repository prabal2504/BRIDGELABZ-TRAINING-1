package com.streamapi;

import java.util.*;

public class StockLogger {
    public static void main(String[] args) {
        List<Double> prices = Arrays.asList(150.5, 152.3, 149.8);

        prices.forEach(System.out::println);
    }
}