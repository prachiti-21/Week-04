package com.junit;

public class Calculator {
    public static int add(int a, int b){
        return a+b;
    }
    public static int subtract(int a,int b){
        return a-b;
    }
    public static int multiply(int a,int b){
        return a*b;
    }
    public static int divide(int a,int b){
        return a/b;
    }

    public static void main(String[] args) {
        try {
            int a = 4;
            int b = 2;
            System.out.println("Addition: " + add(a, b));
            System.out.println("Subtraction: " + subtract(a, b));
            System.out.println("Multiplication: " + multiply(a, b));
            System.out.println("Division: " + divide(a, b));
        }catch (Exception e){
            System.out.println("Cannot be divided by 0");
        }

    }
}
