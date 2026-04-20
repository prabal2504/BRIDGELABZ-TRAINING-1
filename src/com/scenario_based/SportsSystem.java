package com.scenario_based;

import java.util.*;

class Team {
    String name;
    int points;

    public Team(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public String toString() {
        return name + " - " + points;
    }
}

class Match {
    String team1, team2;

    public Match(String t1, String t2) {
        this.team1 = t1;
        this.team2 = t2;
    }
}

class Result {
    String winner;

    public Result(String winner) {
        this.winner = winner;
    }
}

public class SportsSystem {

    Set<Team> teams = new HashSet<>();
    Queue<Match> matches = new LinkedList<>();
    List<Result> results = new ArrayList<>();

    TreeSet<Team> leaderboard =
            new TreeSet<>((a, b) -> b.points - a.points);

    public void addTeam(Team t) {
        teams.add(t);
    }

    public void scheduleMatch(Match m) {
        matches.add(m);
    }

    public void processMatches() {
        while (!matches.isEmpty()) {
            Match m = matches.poll();
            results.add(new Result(m.team1 + " won"));
        }
    }

    public void showLeaderboard() {
        leaderboard.addAll(teams);
        System.out.println("Leaderboard:");
        for (Team t : leaderboard) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {

        SportsSystem s = new SportsSystem();

        s.addTeam(new Team("India", 10));
        s.addTeam(new Team("Australia", 8));

        s.scheduleMatch(new Match("India", "Australia"));

        s.processMatches();
        s.showLeaderboard();
    }
}