package com.annotation;

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.HashMap;
import java.util.Map;

// Step 1: Define the @CacheResult annotation
@Retention(RetentionPolicy.RUNTIME)  // Available at runtime
@Target(ElementType.METHOD)          // Can be applied to methods
@interface CacheResult {
}

// Step 2: Create an Interface with an Expensive Method
interface ExpensiveOperations {
    @CacheResult
    long factorial(int num);
}

// Step 3: Implement ExpensiveOperations with Actual Computation
class ExpensiveOperationsImpl implements ExpensiveOperations {
    @Override
    public long factorial(int num) {
        System.out.println("Computing factorial of " + num);
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}

// Step 4: Implement a Proxy to Handle Caching
class CacheInvocationHandler implements InvocationHandler {
    private final Object target;
    private final Map<String, Object> cache = new HashMap<>();

    public CacheInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.isAnnotationPresent(CacheResult.class)) {
            String key = method.getName() + "(" + args[0] + ")";
            if (cache.containsKey(key)) {
                System.out.println("Returning cached result for " + key);
                return cache.get(key);
            }
            Object result = method.invoke(target, args);
            cache.put(key, result);
            return result;
        }
        return method.invoke(target, args);
    }
}

// Step 5: Test the Caching System
public class CustomCachingSystem {
    public static void main(String[] args) {
        ExpensiveOperations original = new ExpensiveOperationsImpl();

        // Create a proxy instance that enables caching
        ExpensiveOperations proxyInstance = (ExpensiveOperations) Proxy.newProxyInstance(
                ExpensiveOperationsImpl.class.getClassLoader(),
                new Class[]{ExpensiveOperations.class},
                new CacheInvocationHandler(original)
        );

        // Test the caching mechanism
        System.out.println(proxyInstance.factorial(5)); // Computation
        System.out.println(proxyInstance.factorial(5)); // Cached result
        System.out.println(proxyInstance.factorial(6)); // Computation
        System.out.println(proxyInstance.factorial(5)); // Cached result
    }
}

