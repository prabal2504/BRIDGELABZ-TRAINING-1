package com.scenario_based;
import java.util.*;

class Movie {
    String name;
    String genre;

    public Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public String toString() {
        return name + " (" + genre + ")";
    }
}

public class StreamingSystem {

    Stack<Movie> history = new Stack<>();
    Queue<Movie> upNext = new LinkedList<>();
    Set<String> genres = new HashSet<>();
    List<Movie> library = new ArrayList<>();

    public void addMovie(Movie m) {
        library.add(m);
        upNext.add(m);
    }

    public void watchNext() {
        if (!upNext.isEmpty()) {
            Movie m = upNext.poll();
            history.push(m);
            genres.add(m.genre);
            System.out.println("Watched: " + m);
        }
    }

    public void showRecommendations() {
        System.out.println("Genres watched: " + genres);
    }

    public static void main(String[] args) {

        StreamingSystem s = new StreamingSystem();

        s.addMovie(new Movie("Movie1", "Action"));
        s.addMovie(new Movie("Movie2", "Drama"));

        s.watchNext();
        s.watchNext();

        s.showRecommendations();
    }
}