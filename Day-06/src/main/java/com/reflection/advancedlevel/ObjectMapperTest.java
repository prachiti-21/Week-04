package com.reflection.advancedlevel;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.HashMap;

class ObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            // Create a new instance of the class dynamically
            T instance = clazz.getDeclaredConstructor().newInstance();

            // Iterate through map and set field values
            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String fieldName = entry.getKey();
                Object fieldValue = entry.getValue();

                try {
                    // Get the field from the class
                    Field field = clazz.getDeclaredField(fieldName);

                    // Make private fields accessible
                    field.setAccessible(true);

                    // Set the field value
                    field.set(instance, fieldValue);
                } catch (NoSuchFieldException e) {
                    System.out.println("Warning: No field named '" + fieldName + "' found in " + clazz.getSimpleName());
                }
            }

            return instance;
        } catch (Exception e) {
            throw new RuntimeException("Failed to map properties to object: " + e.getMessage(), e);
        }
    }
}

// Sample class to test ObjectMapper
class User {
    private String name;
    private int age;

    public void display() {
        System.out.println("User Name: " + name);
        System.out.println("User Age: " + age);
    }
}



public class ObjectMapperTest {
    public static void main(String[] args) {
        // Create a map of properties
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Alice");
        properties.put("age", 25);

        // Convert map to User object
        User user = ObjectMapper.toObject(User.class, properties);

        // Display the populated object
        user.display();
    }
}

