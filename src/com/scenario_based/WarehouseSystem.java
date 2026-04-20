package com.scenario_based;
import java.util.*;

class PackageItem {
    String id;
    String status;

    public PackageItem(String id, String status) {
        this.id = id;
        this.status = status;
    }

    public String toString() {
        return id + " | " + status;
    }
}

public class WarehouseSystem {

    Queue<PackageItem> deliveryQueue = new LinkedList<>();
    Set<String> packageIds = new HashSet<>();
    List<PackageItem> delivered = new ArrayList<>();
    Stack<PackageItem> returned = new Stack<>();

    public void addPackage(PackageItem p) {
        if (packageIds.add(p.id)) {
            deliveryQueue.add(p);
        }
    }

    public void processDeliveries() {
        while (!deliveryQueue.isEmpty()) {
            PackageItem p = deliveryQueue.poll();
            p.status = "Delivered";
            delivered.add(p);
        }
    }

    public static void main(String[] args) {

        WarehouseSystem w = new WarehouseSystem();

        w.addPackage(new PackageItem("P1", "Pending"));
        w.addPackage(new PackageItem("P2", "Pending"));
        w.addPackage(new PackageItem("P1", "Duplicate"));

        w.processDeliveries();

        System.out.println("Delivered: " + w.delivered);
    }
}