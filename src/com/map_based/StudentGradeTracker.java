package com.map_based;
import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Double> grades = new TreeMap<>();

        // Adding students
        grades.put("Rahul", 85.5);
        grades.put("Ankit", 78.0);
        grades.put("Priya", 91.2);
        grades.put("Sneha", 88.4);

        // Updating grade
        grades.put("Rahul", 90.0);

        // Removing student
        grades.remove("Ankit");

        // Printing in alphabetical order
        System.out.println("Student Grades:");
        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}