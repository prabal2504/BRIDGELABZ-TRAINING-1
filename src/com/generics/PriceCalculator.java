package com.generics;

import java.util.*;

class ProductBase {
    double price;

    ProductBase(double price) {
        this.price = price;
    }

    double getPrice() {
        return price;
    }
}

class Mobile extends ProductBase {
    Mobile(double price) {
        super(price);
    }
}

public class PriceCalculator {

    public static double calculateTotal(List<? extends ProductBase> items) {
        double total = 0;

        for (ProductBase p : items) {
            total += p.getPrice();
        }

        return total;
    }

    public static void main(String[] args) {
        List<Mobile> mobiles = Arrays.asList(
                new Mobile(20000),
                new Mobile(30000)
        );

        System.out.println(calculateTotal(mobiles));
    }
}