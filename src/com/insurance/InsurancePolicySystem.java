package com.insurance;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

class Policy {
    int policyNumber;
    String holderName;
    LocalDate expiryDate;
    String coverageType;
    double premiumAmount;

    public Policy(int policyNumber, String holderName, LocalDate expiryDate,
                  String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public String toString() {
        return policyNumber + " | " + holderName + " | " +
                expiryDate + " | " + coverageType + " | " + premiumAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Policy)) return false;
        Policy p = (Policy) obj;
        return this.policyNumber == p.policyNumber;
    }
}

public class InsurancePolicySystem {

    // Sets
    HashSet<Policy> hashSet = new HashSet<>();
    LinkedHashSet<Policy> linkedHashSet = new LinkedHashSet<>();
    TreeSet<Policy> treeSet = new TreeSet<>(Comparator.comparing(p -> p.expiryDate));

    // Add Policy
    public void addPolicy(Policy p) {
        hashSet.add(p);
        linkedHashSet.add(p);
        treeSet.add(p);
    }

    // Display all policies
    public void display(Set<Policy> set, String title) {
        System.out.println("\n--- " + title + " ---");
        for (Policy p : set) {
            System.out.println(p);
        }
    }

    // Policies expiring within 30 days
    public void expiringSoon() {
        System.out.println("\n--- Policies Expiring in 30 Days ---");

        LocalDate today = LocalDate.now();

        for (Policy p : hashSet) {
            long days = ChronoUnit.DAYS.between(today, p.expiryDate);
            if (days <= 30 && days >= 0) {
                System.out.println(p);
            }
        }
    }

    // Filter by coverage type
    public void filterByCoverage(String type) {
        System.out.println("\n--- Coverage Type: " + type + " ---");

        for (Policy p : hashSet) {
            if (p.coverageType.equalsIgnoreCase(type)) {
                System.out.println(p);
            }
        }
    }

    // Duplicate check (based on policy number)
    public void findDuplicates(List<Policy> policies) {
        System.out.println("\n--- Duplicate Policies ---");

        Set<Integer> seen = new HashSet<>();

        for (Policy p : policies) {
            if (!seen.add(p.policyNumber)) {
                System.out.println("Duplicate: " + p);
            }
        }
    }

    // Performance comparison
    public void performanceTest() {

        System.out.println("\n--- Performance Comparison ---");

        int n = 10000;

        // HashSet
        long start = System.nanoTime();
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < n; i++) h.add(i);
        for (int i = 0; i < n; i++) h.contains(i);
        long end = System.nanoTime();
        System.out.println("HashSet Time: " + (end - start));

        // LinkedHashSet
        start = System.nanoTime();
        LinkedHashSet<Integer> lh = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) lh.add(i);
        for (int i = 0; i < n; i++) lh.contains(i);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Time: " + (end - start));

        // TreeSet
        start = System.nanoTime();
        TreeSet<Integer> t = new TreeSet<>();
        for (int i = 0; i < n; i++) t.add(i);
        for (int i = 0; i < n; i++) t.contains(i);
        end = System.nanoTime();
        System.out.println("TreeSet Time: " + (end - start));
    }

    // Main method
    public static void main(String[] args) {

        InsurancePolicySystem system = new InsurancePolicySystem();

        List<Policy> sample = new ArrayList<>();

        sample.add(new Policy(101, "Amit", LocalDate.now().plusDays(10), "Health", 5000));
        sample.add(new Policy(102, "Ravi", LocalDate.now().plusDays(40), "Auto", 7000));
        sample.add(new Policy(103, "Neha", LocalDate.now().plusDays(20), "Home", 9000));
        sample.add(new Policy(101, "Amit Duplicate", LocalDate.now().plusDays(10), "Health", 5000));

        for (Policy p : sample) {
            system.addPolicy(p);
        }

        system.display(system.hashSet, "HashSet Policies");
        system.display(system.linkedHashSet, "LinkedHashSet Policies");
        system.display(system.treeSet, "TreeSet Policies (Sorted by Expiry)");

        system.expiringSoon();
        system.filterByCoverage("Health");
        system.findDuplicates(sample);
        system.performanceTest();
    }
}