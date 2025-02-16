package com.reflection.advancedlevel;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// Step 1: Define an interface
interface Greeting {
    void sayHello();
}

// Step 2: Implement the interface
class Hello implements Greeting {
    public void sayHello() {
        System.out.println("Hello, World!");
    }
}

// Step 3: Create a Logging Proxy using InvocationHandler
class LoggingInvocationHandler implements InvocationHandler {
    private final Object target;

    public LoggingInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Log method name before execution
        System.out.println("LOG: Calling method -> " + method.getName());

        // Execute the actual method
        return method.invoke(target, args);
    }
}

// Step 4: Test the Proxy in main()
public class LoggingProxyExample {
    public static void main(String[] args) {
        // Original object
        Greeting original = new Hello();

        // Create Proxy instance
        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
                Hello.class.getClassLoader(),  // ClassLoader
                new Class[]{Greeting.class},   // Interfaces to implement
                new LoggingInvocationHandler(original) // InvocationHandler
        );

        // Call method via proxy
        proxyInstance.sayHello();
    }
}

