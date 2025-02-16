package com.reflection.intermediatelevel;

import java.lang.reflect.Method;
import java.util.Scanner;

public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

 class DynamicMethodInvocation {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // Create an instance of MathOperations
            MathOperations mathOps = new MathOperations();

            // Get class reference dynamically
            Class<?> clazz = mathOps.getClass();

            // Take user input for method name
            System.out.print("Enter method name (add, subtract, multiply): ");
            String methodName = scanner.next();

            // Take user input for two integers
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            // Get the method dynamically
            Method method = clazz.getMethod(methodName, int.class, int.class);

            // Invoke the method dynamically
            Object result = method.invoke(mathOps, num1, num2);

            // Display the result
            System.out.println("Result: " + result);

            scanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

