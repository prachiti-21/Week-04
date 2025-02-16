package com.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Field;

// Step 1: Define the @MaxLength annotation
@Retention(RetentionPolicy.RUNTIME)  // Available at runtime
@Target(ElementType.FIELD)           // Can be applied to fields
@interface MaxLength {
    int value();  // Specifies the max allowed length
}

// Step 2: Apply @MaxLength to a field in the User class
class User {

    @MaxLength(10)  // Username should not exceed 10 characters
    private String username;

    public User(String username) {
        validateMaxLength(this, username);
        this.username = username;
    }

    private void validateMaxLength(User user, String username) {
        try {
            Field field = User.class.getDeclaredField("username");
            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength maxLength = field.getAnnotation(MaxLength.class);
                if (username.length() > maxLength.value()) {
                    throw new IllegalArgumentException("Username exceeds max length of " + maxLength.value() + " characters.");
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }
}

// Step 3: Test the validation with different usernames
public class MaxLengthValidator {
    public static void main(String[] args) {
        try {
            User user1 = new User("Alice123");  // Valid
            System.out.println("User created: " + user1.getUsername());

            User user2 = new User("ThisUsernameIsTooLong");  // Invalid
            System.out.println("User created: " + user2.getUsername());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

