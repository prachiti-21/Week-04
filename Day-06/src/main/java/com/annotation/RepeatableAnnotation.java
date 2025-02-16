package com.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Step 1: Define the @BugReport annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

// Step 2: Define the container annotation for multiple reports
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

// Step 3: Apply the @BugReport annotation multiple times
class SoftwareModule {

    @BugReport(description = "NullPointerException when input is null")
    @BugReport(description = "Performance issue when processing large data")
    public void process() {
        System.out.println("Processing data...");
    }
}

// Step 4: Retrieve and print all bug reports using Reflection
public class RepeatableAnnotation {
    public static void main(String[] args) throws Exception {
        // Get class and method reference
        Class<SoftwareModule> obj = SoftwareModule.class;
        Method method = obj.getMethod("process");

        // Check if @BugReport is present and retrieve all instances
        if (method.isAnnotationPresent(BugReports.class)) {
            BugReports bugReports = method.getAnnotation(BugReports.class);
            for (BugReport bug : bugReports.value()) {
                System.out.println("Bug Description: " + bug.description());
            }
        }
    }
}

