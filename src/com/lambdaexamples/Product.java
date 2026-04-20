package com.lambdaexamples;

import java.util.*;

public class Product {
    String name;
    int price;
    double rating;
    int discount;

    Product(String name, int price, double rating, int discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " Price: " + price +
                " Rating: " + rating +
                " Discount: " + discount + "%";
    }

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 50000, 4.5, 10));
        products.add(new Product("Phone", 20000, 4.8, 15));
        products.add(new Product("Tablet", 30000, 4.2, 20));

        // Sort by Price using Lambda
        products.sort((p1, p2) -> p1.price - p2.price);

        System.out.println("Sorted by Price:");
        products.forEach(System.out::println);
    }
}