package com.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

// Step 1: Define the @JsonField annotation
@Retention(RetentionPolicy.RUNTIME)  // Available at runtime
@Target(ElementType.FIELD)           // Can be applied to fields
@interface JsonField {
    String name();  // Custom JSON key name
}

// Step 2: Apply @JsonField to fields in the User class
class Userr {

    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_email")
    private String email;

    private int age;  // This field won't be serialized (no annotation)

    public Userr(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }

    // Step 3: Convert object to JSON using Reflection
    public String toJson() {
        Map<String, String> jsonMap = new HashMap<>();

        for (Field field : this.getClass().getDeclaredFields()) {
            field.setAccessible(true);  // Allow access to private fields

            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField jsonField = field.getAnnotation(JsonField.class);
                try {
                    jsonMap.put(jsonField.name(), field.get(this).toString());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        // Convert Map to JSON string format
        StringBuilder jsonString = new StringBuilder("{");
        for (Map.Entry<String, String> entry : jsonMap.entrySet()) {
            jsonString.append("\"").append(entry.getKey()).append("\": ")
                    .append("\"").append(entry.getValue()).append("\", ");
        }
        if (jsonString.length() > 1) {
            jsonString.delete(jsonString.length() - 2, jsonString.length());  // Remove last comma
        }
        jsonString.append("}");

        return jsonString.toString();
    }
}

// Step 4: Test the serialization
public class CustomJsonSerializer {
    public static void main(String[] args) {
        Userr user = new Userr("john_doe", "john@example.com", 25);
        System.out.println(user.toJson());  // Convert object to JSON
    }
}

