package com.scenario_based;
import java.util.*;

public class FeedbackSystem {

    List<String> allFeedback = new ArrayList<>();
    Set<String> unique = new HashSet<>();
    Queue<String> queue = new LinkedList<>();
    Stack<String> recent = new Stack<>();

    public void addFeedback(String f) {
        allFeedback.add(f);

        if (unique.add(f)) {
            queue.add(f);
        }
    }

    public void processFeedback() {
        while (!queue.isEmpty()) {
            recent.push(queue.poll());
        }
    }

    public void showRecent() {
        System.out.println("Recent feedback:");
        for (int i = recent.size() - 1; i >= 0; i--) {
            System.out.println(recent.get(i));
        }
    }

    public static void main(String[] args) {

        FeedbackSystem f = new FeedbackSystem();

        f.addFeedback("Good");
        f.addFeedback("Nice");
        f.addFeedback("Good"); // duplicate

        f.processFeedback();
        f.showRecent();
    }
}