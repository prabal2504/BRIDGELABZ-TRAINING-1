package com.map_based;
import java.util.*;

public class LibraryCatalog {
    public static void main(String[] args) {
        Map<String, String> books = new TreeMap<>();

        // Add books
        books.put("978-111", "Java Basics");
        books.put("978-222", "Data Structures");
        books.put("978-333", "Operating Systems");

        // Search by ISBN
        String isbn = "978-222";

        if (books.containsKey(isbn)) {
            System.out.println("Book Title: " + books.get(isbn));
        } else {
            System.out.println("Book not found");
        }

        // Remove book
        books.remove("978-333");

        // Print all books
        System.out.println("Library Catalog:");
        for (Map.Entry<String, String> entry : books.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Search by title
        String titleSearch = "Java Basics";
        for (Map.Entry<String, String> entry : books.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(titleSearch)) {
                System.out.println("Found ISBN: " + entry.getKey());
            }
        }
    }
}
