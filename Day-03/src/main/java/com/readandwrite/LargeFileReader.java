package com.readandwrite;

import java.io.*;

public class LargeFileReader {
    public static void main(String[] args) {
        String filePath = "input.txt"; // Change this to your actual file path

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}

