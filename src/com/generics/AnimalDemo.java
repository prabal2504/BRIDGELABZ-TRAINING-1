package com.generics;

import java.util.*;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class AnimalDemo {

    public static void printAnimals(List<? extends Animal> animals) {
        System.out.println("Animals count: " + animals.size());
    }

    public static void main(String[] args) {
        printAnimals(Arrays.asList(new Dog(), new Dog()));
        printAnimals(Arrays.asList(new Cat(), new Cat()));
    }
}