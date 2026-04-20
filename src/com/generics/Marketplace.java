package com.generics;

class Product<T> {
    T category;
    double price;

    Product(T category, double price) {
        this.category = category;
        this.price = price;
    }

    public void show() {
        System.out.println(category + " Price: " + price);
    }
}

public class Marketplace {

    public static <T extends Product<?>> void applyDiscount(
            T product, double percentage) {

        product.price = product.price -
                (product.price * percentage / 100);

        product.show();
    }

    public static void main(String[] args) {
        Product<String> book =
                new Product<>("Book Category", 500);

        applyDiscount(book, 10);
    }
}