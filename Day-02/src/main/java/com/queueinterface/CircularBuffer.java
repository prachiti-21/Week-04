package com.queueinterface;

import java.util.LinkedList;
import java.util.Queue;


import java.util.*;

// Class representing a circular buffer
class CircularBuffer {
    private int[] buffer;
    private int size, head, tail, count;

    public CircularBuffer(int size) {
        this.size = size;
        this.buffer = new int[size];
        this.head = 0;
        this.tail = 0;
        this.count = 0;
    }

    // Insert element into the buffer
    public void insert(int value) {
        buffer[tail] = value;
        tail = (tail + 1) % size;
        if (count < size) {
            count++;
        } else {
            head = (head + 1) % size; // Overwrite oldest element
        }
    }

    // Display the buffer contents
    public void display() {
        System.out.print("Buffer: [");
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(head + i) % size] + (i < count - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.display(); // Output: [1, 2, 3]
        buffer.insert(4);
        buffer.display(); // Output: [2, 3, 4]
    }
}

