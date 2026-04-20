package com.queueinterface;

public class CircularBuffer {

    int[] buffer;
    int size;
    int front = 0;
    int rear = 0;
    int count = 0;

    public CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    public void insert(int value) {

        if (count == size) {
            front = (front + 1) % size;
            count--;
        }

        buffer[rear] = value;
        rear = (rear + 1) % size;
        count++;
    }

    public void display() {
        System.out.print("Buffer: ");
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(front + i) % size] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);

        cb.display();

        cb.insert(4); // overwrites oldest

        cb.display();
    }
}