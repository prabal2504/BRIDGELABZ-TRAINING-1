package com.generics;

import java.util.*;

abstract class WarehouseItem {
    String name;

    WarehouseItem(String name) {
        this.name = name;
    }
}

class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name);
    }
}

class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name);
    }
}

public class Storage<T extends WarehouseItem> {
    List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void displayItems() {
        for (T item : items) {
            System.out.println(item.name);
        }
    }

    public static void main(String[] args) {
        Storage<Electronics> storage = new Storage<>();
        storage.addItem(new Electronics("Laptop"));
        storage.addItem(new Electronics("Mobile"));
        storage.displayItems();
    }
}