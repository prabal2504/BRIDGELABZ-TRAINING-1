package com.streamapi;

import java.util.*;

public class SensorReadings {
    public static void main(String[] args) {
        List<Integer> readings = Arrays.asList(45, 70, 85, 30, 95);

        readings.stream()
                .filter(r -> r > 60)
                .forEach(System.out::println);
    }
}