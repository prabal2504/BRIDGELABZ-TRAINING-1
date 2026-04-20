package com.scenario_based;
import java.util.*;

class Booking {
    String user;
    boolean vip;

    public Booking(String user, boolean vip) {
        this.user = user;
        this.vip = vip;
    }

    public String toString() {
        return user + (vip ? " (VIP)" : "");
    }
}

public class EventTicketSystem {

    List<Booking> allBookings = new ArrayList<>();
    Set<String> users = new HashSet<>();
    Queue<Booking> queue = new LinkedList<>();

    PriorityQueue<Booking> vipQueue =
            new PriorityQueue<>((a, b) -> Boolean.compare(b.vip, a.vip));

    public void register(Booking b) {
        if (users.add(b.user)) {
            queue.add(b);
            vipQueue.add(b);
        }
    }

    public void process() {
        while (!vipQueue.isEmpty()) {
            System.out.println("Confirmed: " + vipQueue.poll());
        }
    }

    public static void main(String[] args) {

        EventTicketSystem e = new EventTicketSystem();

        e.register(new Booking("Amit", false));
        e.register(new Booking("Ravi", true));
        e.register(new Booking("Neha", true));

        e.process();
    }
}