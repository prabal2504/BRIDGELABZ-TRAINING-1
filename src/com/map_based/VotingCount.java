package com.map_based;
import java.util.*;

public class VotingCount {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();

        String[] voteList = {
                "Aman", "Riya", "Aman", "Karan", "Riya",
                "Aman", "Karan", "Riya", "Aman", "Riya"
        };

        for (String candidate : voteList) {
            votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        }

        String winner = null;
        int maxVotes = 0;

        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        System.out.println("Total Votes:");
        System.out.println(votes);

        System.out.println("Winner: " + winner);
    }
}