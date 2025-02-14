package com.readuserinput;

import java.io.*;

public class ReadUserInput {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            // Asking user for input
            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            String age = br.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = br.readLine();

            // Writing user input to a file
            try (FileWriter fw = new FileWriter("input.txt")) {
                fw.write("Name: " + name + "\n");
                fw.write("Age: " + age + "\n");
                fw.write("Favorite Language: " + language + "\n");
                System.out.println("User data saved successfully to input.txt");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading input or writing to the file.");
            e.printStackTrace();
        }

    }
}
