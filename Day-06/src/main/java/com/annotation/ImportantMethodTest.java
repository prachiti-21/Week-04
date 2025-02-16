package com.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Step 1: Define the @ImportantMethod annotation
@Retention(RetentionPolicy.RUNTIME)  // Available at runtime
@Target(ElementType.METHOD)          // Can be applied to methods
@interface ImportantMethod {
    String level() default "HIGH";   // Optional parameter with default value
}

// Step 2: Apply the annotation to important methods
class TaskManagerr {

    @ImportantMethod(level = "HIGH")
    public void processCriticalTask() {
        System.out.println("Processing a critical task...");
    }

    @ImportantMethod(level = "MEDIUM")
    public void processRegularTask() {
        System.out.println("Processing a regular task...");
    }

    public void helperMethod() {
        System.out.println("This is a helper method.");
    }
}

// Step 3: Retrieve and print important methods using Reflection
public class ImportantMethodTest {
    public static void main(String[] args) {
        Class<TaskManager> obj = TaskManager.class;

        // Iterate through all methods in TaskManager
        for (Method method : obj.getDeclaredMethods()) {
            // Check if @ImportantMethod is present
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Important Method: " + method.getName() + ", Level: " + annotation.level());
            }
        }
    }
}

