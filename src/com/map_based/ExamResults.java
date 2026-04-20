package com.map_based;
import java.util.*;

public class ExamResults {

    public static void main(String[] args) {

        Map<String, Map<String, Integer>> data = new HashMap<>();

        // Subject: Math
        Map<String, Integer> math = new HashMap<>();
        math.put("Amit", 85);
        math.put("Ravi", 92);
        math.put("Neha", 78);

        // Subject: Science
        Map<String, Integer> science = new HashMap<>();
        science.put("Amit", 95);
        science.put("Ravi", 88);
        science.put("Neha", 91);

        data.put("Math", math);
        data.put("Science", science);

        for (String subject : data.keySet()) {

            Map<String, Integer> students = data.get(subject);

            String topper = "";
            int max = 0;

            for (String s : students.keySet()) {
                if (students.get(s) > max) {
                    max = students.get(s);
                    topper = s;
                }
            }

            System.out.println(subject + " Topper: " + topper + " -> " + max);
        }
    }
}