package com.reflection.advancedlevel;

import java.lang.annotation.*;
import java.lang.reflect.*;

// Step 1: Define the @Inject annotation
@Retention(RetentionPolicy.RUNTIME) // Available at runtime
@Target(ElementType.FIELD)           // Used on fields
@interface Inject {}

// Step 2: Define a Service to be Injected
class DatabaseService {
    public void connect() {
        System.out.println("Connected to Database!");
    }
}

// Step 3: Define another Service that depends on DatabaseService
class UserService {
    @Inject  // Mark field for Dependency Injection
    private DatabaseService databaseService;

    public void getUser() {
        databaseService.connect();
        System.out.println("Fetching User Data...");
    }
}

// Step 4: Define a DI Container that injects dependencies dynamically
class DIContainer {
    public static void injectDependencies(Object object) {
        Field[] fields = object.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                try {
                    // Get the type of the field (dependency)
                    Class<?> dependencyType = field.getType();

                    // Create an instance of the dependency dynamically
                    Object dependencyInstance = dependencyType.getDeclaredConstructor().newInstance();

                    // Enable access to private fields
                    field.setAccessible(true);

                    // Inject the dependency into the object
                    field.set(object, dependencyInstance);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to inject dependency: " + e.getMessage(), e);
                }
            }
        }
    }
}

// Step 5: Create a Controller class that uses UserService
class UserController {
    @Inject
    UserService userService;

    public void handleRequest() {
        userService.getUser();
    }
}

// Step 6: Test Dependency Injection in Main()
public class SimpleDI {
    public static void main(String[] args) {
        // Create an instance of UserController (without manually injecting dependencies)
        UserController controller = new UserController();

        // Perform Dependency Injection
        DIContainer.injectDependencies(controller);
        DIContainer.injectDependencies(controller.userService); // Inject into nested dependencies

        // Use the injected service
        controller.handleRequest();
    }
}

