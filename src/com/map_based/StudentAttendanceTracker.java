package com.map_based;
import java.util.*;

public class StudentAttendanceTracker {
    public static void main(String[] args) {
        Map<String, Integer> attendance = new HashMap<>();

        attendance.put("Rahul", 0);
        attendance.put("Priya", 0);
        attendance.put("Aman", 0);
        attendance.put("Sneha", 0);
        attendance.put("Karan", 0);

        String[][] presentDays = {
                {"Rahul", "Priya", "Aman"},
                {"Rahul", "Sneha"},
                {"Priya", "Karan"},
                {"Rahul", "Aman", "Sneha"},
                {"Rahul", "Priya", "Karan"}
        };

        for (String[] day : presentDays) {
            for (String student : day) {
                attendance.put(student, attendance.get(student) + 1);
            }
        }

        int threshold = 3;

        System.out.println("Under-attending Students:");
        for (Map.Entry<String, Integer> entry : attendance.entrySet()) {
            if (entry.getValue() < threshold) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}