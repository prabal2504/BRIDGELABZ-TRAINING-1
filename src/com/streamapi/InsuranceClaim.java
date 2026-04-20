package com.streamapi;

import java.util.*;
import java.util.stream.Collectors;

class Claim {
    String type;
    double amount;

    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}

public class InsuranceClaim {
    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
                new Claim("Health", 5000),
                new Claim("Health", 7000),
                new Claim("Vehicle", 10000)
        );

        Map<String, Double> averageClaims = claims.stream()
                .collect(Collectors.groupingBy(
                        c -> c.type,
                        Collectors.averagingDouble(c -> c.amount)
                ));

        System.out.println(averageClaims);
    }
}