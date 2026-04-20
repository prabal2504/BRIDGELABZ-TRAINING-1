package com.scenario_based;
import java.util.*;

class Product {
    String name;
    int stock;
    double price;

    public Product(String name, int stock, double price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " | Stock: " + stock + " | Price: " + price;
    }
}

public class InventorySystem {

    Set<String> productNames = new HashSet<>();
    List<Product> productList = new ArrayList<>();
    Queue<Product> restockQueue = new LinkedList<>();
    Stack<Product> restockedStack = new Stack<>();

    public void addProduct(Product p) {
        if (productNames.add(p.name)) {
            productList.add(p);
        } else {
            System.out.println("Duplicate product ignored: " + p.name);
        }
    }

    public void checkLowStock() {
        for (Product p : productList) {
            if (p.stock < 5) {
                restockQueue.add(p);
            }
        }
    }

    public void processRestock() {
        System.out.println("\nRestocking Products:");
        while (!restockQueue.isEmpty()) {
            Product p = restockQueue.poll();
            p.stock += 10;
            restockedStack.push(p);
            System.out.println("Restocked: " + p);
        }
    }

    public void undoRestock() {
        System.out.println("\nUndo Last Restock:");
        if (!restockedStack.isEmpty()) {
            Product p = restockedStack.pop();
            p.stock -= 10;
            System.out.println("Rollback Done: " + p);
        }
    }

    public static void main(String[] args) {

        InventorySystem inv = new InventorySystem();

        inv.addProduct(new Product("Rice", 2, 50));
        inv.addProduct(new Product("Wheat", 10, 40));
        inv.addProduct(new Product("Rice", 5, 55)); // duplicate

        inv.checkLowStock();
        inv.processRestock();
        inv.undoRestock();
    }
}