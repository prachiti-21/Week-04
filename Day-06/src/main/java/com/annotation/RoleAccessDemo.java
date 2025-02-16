package com.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Step 1: Define the @RoleAllowed annotation
@Retention(RetentionPolicy.RUNTIME)  // Available at runtime
@Target(ElementType.METHOD)           // Can be applied to methods
@interface RoleAllowed {
    String value();  // Role required to access the method
}

// Step 2: Create a class with restricted methods
class SecureService {

    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Admin task executed!");
    }

    @RoleAllowed("USER")
    public void userTask() {
        System.out.println("User task executed!");
    }

    public void openTask() {
        System.out.println("Open task executed! No restrictions.");
    }
}

// Step 3: Simulate role checking before method execution
class RoleBasedAccessControl {
    private String currentUserRole;

    public RoleBasedAccessControl(String role) {
        this.currentUserRole = role;
    }

    public void executeMethod(Object obj, String methodName) {
        try {
            Method method = obj.getClass().getMethod(methodName);

            // Check if @RoleAllowed is present
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
                if (!roleAllowed.value().equals(currentUserRole)) {
                    System.out.println("Access Denied! Required role: " + roleAllowed.value());
                    return;
                }
            }

            // Invoke method if role matches or no restriction
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Step 4: Test the role-based access control
public class RoleAccessDemo {
    public static void main(String[] args) {
        SecureService service = new SecureService();

        RoleBasedAccessControl adminAccess = new RoleBasedAccessControl("ADMIN");
        RoleBasedAccessControl userAccess = new RoleBasedAccessControl("USER");
        RoleBasedAccessControl guestAccess = new RoleBasedAccessControl("GUEST");

        System.out.println("Admin trying to execute:");
        adminAccess.executeMethod(service, "adminTask");

        System.out.println("\nUser trying to execute:");
        userAccess.executeMethod(service, "adminTask");

        System.out.println("\nGuest trying to execute:");
        guestAccess.executeMethod(service, "userTask");

        System.out.println("\nGuest trying to execute an open method:");
        guestAccess.executeMethod(service, "openTask");
    }
}

