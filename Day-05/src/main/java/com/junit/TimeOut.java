package com.junit;

public class TimeOut {
    public void longRunningTask() {
        try {
            Thread.sleep(3000); // Simulates a long-running process
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
