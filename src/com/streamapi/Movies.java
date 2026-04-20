package com.streamapi;

import java.util.*;

class Movie {
    String name;
    double rating;
    int year;

    Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String toString() {
        return name + " Rating: " + rating + " Year: " + year;
    }
}

public class Movies {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Movie A", 4.8, 2024),
                new Movie("Movie B", 4.5, 2023),
                new Movie("Movie C", 4.9, 2025)
        );

        movies.stream()
                .filter(m -> m.rating >= 4.5)
                .sorted((m1, m2) -> Double.compare(m2.rating, m1.rating))
                .limit(5)
                .forEach(System.out::println);
    }
}