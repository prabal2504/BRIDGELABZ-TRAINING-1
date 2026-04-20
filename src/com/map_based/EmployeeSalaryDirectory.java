package com.map_based;
import java.util.*;

public class EmployeeSalaryDirectory {
    public static void main(String[] args) {
        Map<String, Double> salaries = new HashMap<>();

        salaries.put("Rahul", 50000.0);
        salaries.put("Priya", 65000.0);
        salaries.put("Aman", 72000.0);
        salaries.put("Sneha", 72000.0);
        salaries.put("Karan", 45000.0);
        salaries.put("Riya", 55000.0);

        String employee = "Rahul";
        double raisePercent = 10;

        if (salaries.containsKey(employee)) {
            double newSalary = salaries.get(employee) +
                    (salaries.get(employee) * raisePercent / 100);
            salaries.put(employee, newSalary);
        } else {
            System.out.println("Employee not found");
        }

        double total = 0;
        double maxSalary = 0;

        for (double salary : salaries.values()) {
            total += salary;
            if (salary > maxSalary) {
                maxSalary = salary;
            }
        }

        System.out.println("Average Salary: " + (total / salaries.size()));

        System.out.println("Highest Paid Employee(s):");
        for (Map.Entry<String, Double> entry : salaries.entrySet()) {
            if (entry.getValue() == maxSalary) {
                System.out.println(entry.getKey());
            }
        }
    }
}