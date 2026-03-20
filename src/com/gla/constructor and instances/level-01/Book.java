package com.gla.Constructors_Instance.Level_1;

public class Book {
    String title;
    String author;
    double price;

    // Default Constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized Constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        Book b1 = new Book();  // Default
        Book b2 = new Book("Java Basics", "James Gosling", 499);

        b1.display();
        System.out.println("-----");
        b2.display();
    }
}
