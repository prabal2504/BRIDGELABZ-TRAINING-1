package com.generics;

class Fruit {
    String name;

    Fruit(String name) {
        this.name = name;
    }
}

class Apple extends Fruit {
    Apple() {
        super("Apple");
    }
}

class Mango extends Fruit {
    Mango() {
        super("Mango");
    }
}

public class FruitBox<T extends Fruit> {
    T fruit;

    public void add(T fruit) {
        this.fruit = fruit;
    }

    public void display() {
        System.out.println(fruit.name);
    }

    public static void main(String[] args) {
        FruitBox<Apple> box = new FruitBox<>();
        box.add(new Apple());
        box.display();
    }
}