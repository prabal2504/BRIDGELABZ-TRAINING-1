package com.gla.Assisted_Problem;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println(name + " " + id + " " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String language;

    Developer(String name, int id, double salary, String language) {
        super(name, id, salary);
        this.language = language;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Language: " + language);
    }
}

class Intern extends Employee {
    int duration;

    Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Intern Duration: " + duration);
    }
}

public class EmployeeHierarchyMain {
    public static void main(String[] args) {

        Employee e1 = new Manager("Rahul", 1, 80000, 10);
        Employee e2 = new Developer("Aman", 2, 60000, "Java");
        Employee e3 = new Intern("Ravi", 3, 15000, 6);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
