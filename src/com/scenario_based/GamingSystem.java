package com.scenario_based;

import java.util.*;

class Player {
    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class GamingSystem {

    Set<String> players = new HashSet<>();
    Queue<String> matches = new LinkedList<>();
    List<String> results = new ArrayList<>();

    TreeSet<Integer> leaderboard = new TreeSet<>(Collections.reverseOrder());

    public static void main(String[] args) {

        GamingSystem g = new GamingSystem();

        g.players.add("Amit");
        g.players.add("Ravi");

        g.matches.add("Match1");
        g.matches.add("Match2");

        g.results.add("Amit Won");
        g.results.add("Ravi Won");

        g.leaderboard.add(100);
        g.leaderboard.add(80);

        System.out.println("Leaderboard: " + g.leaderboard);
    }
}