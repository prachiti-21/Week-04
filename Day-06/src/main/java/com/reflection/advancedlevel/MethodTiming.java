package com.reflection.advancedlevel;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// Step 1: Define an interface
interface Task {
    void execute();
}

// Step 2: Implement the interface with some time-consuming logic
class HeavyTask implements Task {
    public void execute() {
        System.out.println("Executing heavy task...");
        try {
            Thread.sleep(500); // Simulating a time-consuming task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task completed.");
    }
}

// Step 3: Create a Timing Proxy using InvocationHandler
class TimingInvocationHandler implements InvocationHandler {
    private final Object target;

    public TimingInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.nanoTime(); // Start time
        Object result = method.invoke(target, args);
        long endTime = System.nanoTime(); // End time

        long duration = (endTime - startTime) / 1_000_000; // Convert to milliseconds
        System.out.println("LOG: Execution time of " + method.getName() + " -> " + duration + " ms");

        return result;
    }
}

// Step 4: Test the Proxy in main()
public class MethodTiming {
    public static void main(String[] args) {
        // Original object
        Task originalTask = new HeavyTask();

        // Create Proxy instance
        Task proxyInstance = (Task) Proxy.newProxyInstance(
                HeavyTask.class.getClassLoader(),  // ClassLoader
                new Class[]{Task.class},           // Interfaces to implement
                new TimingInvocationHandler(originalTask) // InvocationHandler
        );

        // Call method via proxy
        proxyInstance.execute();
    }
}
