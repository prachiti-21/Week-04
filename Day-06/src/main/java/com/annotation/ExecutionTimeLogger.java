package com.annotation;

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.concurrent.TimeUnit;

// Step 1: Define @LogExecutionTime annotation
@Retention(RetentionPolicy.RUNTIME)  // Available at runtime
@Target(ElementType.METHOD)          // Can be applied to methods
@interface LogExecutionTime {}

// Step 2: Create a class with annotated methods
class TaskProcessor {

    @LogExecutionTime
    public void fastTask() {
        System.out.println("Executing Fast Task...");
    }

    @LogExecutionTime
    public void slowTask() {
        System.out.println("Executing Slow Task...");
        try {
            Thread.sleep(1000); // Simulating a slow task (1 second)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void regularMethod() {
        System.out.println("This method is not logged.");
    }
}

// Step 3: Create a Dynamic Proxy to Intercept Method Calls
class ExecutionTimeHandler implements InvocationHandler {
    private final Object target;

    public ExecutionTimeHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Check if method has @LogExecutionTime annotation
        if (method.isAnnotationPresent(LogExecutionTime.class)) {
            long startTime = System.nanoTime();
            Object result = method.invoke(target, args);
            long endTime = System.nanoTime();
            long duration = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
            System.out.println("Execution Time of " + method.getName() + ": " + duration + " ms\n");
            return result;
        }
        return method.invoke(target, args);
    }
}

// Step 4: Main Class to Test Execution Time Logging
public class ExecutionTimeLogger {
    public static void main(String[] args) {
        TaskProcessor original = new TaskProcessor();

        // Create Proxy Instance to Intercept Method Calls
        TaskProcessor proxyInstance = (TaskProcessor) Proxy.newProxyInstance(
                TaskProcessor.class.getClassLoader(),
                new Class[]{TaskProcessor.class},
                new ExecutionTimeHandler(original)
        );

        // Calling methods
        proxyInstance.fastTask();
        proxyInstance.slowTask();
        proxyInstance.regularMethod();  // This won't be logged
    }
}

