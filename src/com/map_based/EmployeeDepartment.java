package com.map_based;
import java.util.*;

public class EmployeeDepartment {

    public static void main(String[] args) {

        Map<Integer, String> empDept = new HashMap<>();

        empDept.put(101, "IT");
        empDept.put(102, "HR");
        empDept.put(103, "IT");
        empDept.put(104, "Finance");

        // Change department
        empDept.put(102, "IT");

        // Reverse lookup (department wise)
        Map<String, List<Integer>> deptMap = new HashMap<>();

        for (Map.Entry<Integer, String> e : empDept.entrySet()) {

            deptMap.putIfAbsent(e.getValue(), new ArrayList<>());
            deptMap.get(e.getValue()).add(e.getKey());
        }

        System.out.println("Department grouping:");
        System.out.println(deptMap);
    }
}