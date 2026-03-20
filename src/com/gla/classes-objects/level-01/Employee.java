package com.gla.Class_and_Object.Level_1;

public class Employee {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.name = "John";
        emp.id = 101;
        emp.salary = 50000;

        emp.displayDetails();
    }

}
