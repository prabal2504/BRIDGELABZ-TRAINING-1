package com.queueinterface;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumbersQueue {
    public static void main(String[] args) {

        int n = 5;
        generateBinary(n);
    }

    static void generateBinary(int n) {

        Queue<String> queue = new LinkedList<>();

        queue.add("1");

        for (int i = 0; i < n; i++) {
            String current = queue.remove();
            System.out.print(current + " ");

            queue.add(current + "0");
            queue.add(current + "1");
        }
    }
}