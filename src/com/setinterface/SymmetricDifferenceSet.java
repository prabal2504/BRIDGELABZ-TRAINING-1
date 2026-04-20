package com.setinterface;

import java.util.HashSet;

public class SymmetricDifferenceSet {
    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(4);
        set2.add(5);

        HashSet<Integer> symDiff = new HashSet<>(set1);
        symDiff.addAll(set2); // union

        HashSet<Integer> temp = new HashSet<>(set1);
        temp.retainAll(set2); // intersection

        symDiff.removeAll(temp); // (A ∪ B) - (A ∩ B)

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Symmetric Difference: " + symDiff);
    }
}
