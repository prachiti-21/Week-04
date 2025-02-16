package com.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Step 1: Define the @Todo annotation
@Retention(RetentionPolicy.RUNTIME)  // Available at runtime
@Target(ElementType.METHOD)          // Can be applied to methods
@interface Todo {
    String task();          // Required: Task description
    String assignedTo();    // Required: Developer name
    String priority() default "MEDIUM";  // Optional: Default priority = MEDIUM
}

// Step 2: Apply @Todo annotation to multiple methods
class ProjectModule {

    @Todo(task = "Implement user authentication", assignedTo = "Alice", priority = "HIGH")
    public void implementAuth() {
        System.out.println("Working on authentication...");
    }

    @Todo(task = "Optimize database queries", assignedTo = "Bob")
    public void optimizeDatabase() {
        System.out.println("Optimizing database...");
    }

    @Todo(task = "Improve UI responsiveness", assignedTo = "Charlie", priority = "LOW")
    public void improveUI() {
        System.out.println("Enhancing UI responsiveness...");
    }

    public void completedFeature() {
        System.out.println("This feature is completed.");
    }
}

// Step 3: Retrieve and print all pending tasks using Reflection
public class TodoAnnotation {
    public static void main(String[] args) {
        Class<ProjectModule> obj = ProjectModule.class;

        // Iterate through all methods in ProjectModule
        for (Method method : obj.getDeclaredMethods()) {
            // Check if @Todo is present
            if (method.isAnnotationPresent(Todo.class)) {
                Todo annotation = method.getAnnotation(Todo.class);
                System.out.println("Task: " + annotation.task());
                System.out.println("Assigned To: " + annotation.assignedTo());
                System.out.println("Priority: " + annotation.priority());
                System.out.println("Method: " + method.getName());
                System.out.println("-------------------------");
            }
        }
    }
}

