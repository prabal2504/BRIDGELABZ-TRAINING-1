package com.scenario_based;

import java.util.*;

class Parcel {
    String id;
    int priority;

    public Parcel(String id, int priority) {
        this.id = id;
        this.priority = priority;
    }

    public String toString() {
        return id + " (P:" + priority + ")";
    }
}

public class CourierSystem {

    PriorityQueue<Parcel> pq =
            new PriorityQueue<>((a, b) -> b.priority - a.priority);

    Set<String> ids = new HashSet<>();
    List<Parcel> completed = new ArrayList<>();
    Queue<Parcel> normalQueue = new LinkedList<>();

    public void addParcel(Parcel p) {
        if (ids.add(p.id)) {
            pq.add(p);
        } else {
            System.out.println("Duplicate parcel ignored: " + p.id);
        }
    }

    public void processDeliveries() {
        while (!pq.isEmpty()) {
            Parcel p = pq.poll();
            completed.add(p);
            System.out.println("Delivered: " + p);
        }
    }

    public static void main(String[] args) {

        CourierSystem c = new CourierSystem();

        c.addParcel(new Parcel("P1", 5));
        c.addParcel(new Parcel("P2", 2));
        c.addParcel(new Parcel("P1", 4)); // duplicate

        c.processDeliveries();
    }
}