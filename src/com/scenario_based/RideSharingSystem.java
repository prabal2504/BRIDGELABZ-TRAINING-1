package com.scenario_based;

import java.util.*;

class RideRequest {
    String name;
    int priority;

    public RideRequest(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
}

public class RideSharingSystem {

    Queue<RideRequest> queue = new LinkedList<>();
    Set<String> drivers = new HashSet<>();
    List<String> completedRides = new ArrayList<>();

    PriorityQueue<RideRequest> priorityQueue =
            new PriorityQueue<>((a, b) -> b.priority - a.priority);

    public static void main(String[] args) {

        RideSharingSystem r = new RideSharingSystem();

        r.drivers.add("Driver1");
        r.drivers.add("Driver2");

        r.priorityQueue.add(new RideRequest("UserA", 5));
        r.priorityQueue.add(new RideRequest("UserB", 2));

        while (!r.priorityQueue.isEmpty()) {
            RideRequest req = r.priorityQueue.poll();
            System.out.println("Assigned ride: " + req.name);
            r.completedRides.add(req.name);
        }

        System.out.println("Completed: " + r.completedRides);
    }
}