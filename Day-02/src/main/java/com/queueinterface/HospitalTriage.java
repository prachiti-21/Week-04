package com.queueinterface;

import java.util.*;

// Class representing a patient
class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

// Comparator to prioritize patients based on severity (higher severity first)
class SeverityComparator implements Comparator<Patient> {
    @Override
    public int compare(Patient p1, Patient p2) {
        return Integer.compare(p2.severity, p1.severity); // Descending order
    }
}

public class HospitalTriage {
    public static void main(String[] args) {
        // PriorityQueue with custom comparator
        PriorityQueue<Patient> queue = new PriorityQueue<>(new SeverityComparator());

        // Adding patients
        queue.add(new Patient("John", 3));
        queue.add(new Patient("Alice", 5));
        queue.add(new Patient("Bob", 2));

        // Processing patients in order of severity
        System.out.println("Order of treatment:");
        while (!queue.isEmpty()) {
            Patient p = queue.poll(); // Retrieve and remove highest priority patient
            System.out.println(p.name + " (Severity: " + p.severity + ")");
        }
    }
}

