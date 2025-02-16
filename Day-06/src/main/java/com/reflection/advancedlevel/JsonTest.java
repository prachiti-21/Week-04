package com.reflection.advancedlevel;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Arrays;
import java.util.Arrays;
/*class JsonSerializer {
    public static String toJson(Object obj) {
        if (obj == null) {
            return "null";
        }

        StringBuilder json = new StringBuilder();
        Class<?> clazz = obj.getClass();
        json.append("{");

        Field[] fields = clazz.getDeclaredFields();
        int fieldCount = 0;

        for (Field field : fields) {
            field.setAccessible(true); // Allow access to private fields
            try {
                Object value = field.get(obj);
                if (fieldCount > 0) {
                    json.append(", ");
                }
                json.append("\"").append(field.getName()).append("\": ");
                json.append(formatValue(value));
                fieldCount++;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        json.append("}");
        return json.toString();
    }

    private static String formatValue(Object value) {
        if (value == null) {
            return "null";
        } else if (value instanceof String) {
            return "\"" + value + "\"";
        } else if (value instanceof Number || value instanceof Boolean) {
            return value.toString();
        } else if (value instanceof List) {
            return formatList((List<?>) value);
        } else if (value.getClass().isArray()) {
            return formatArray(value);
        } else {
            return toJson(value); // Recursive call for nested objects
        }
    }

    private static String formatList(List<?> list) {
        StringBuilder json = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                json.append(", ");
            }
            json.append(formatValue(list.get(i)));
        }
        json.append("]");
        return json.toString();
    }

    private static String formatArray(Object array) {
        int length = Arrays.getLength(array);
        StringBuilder json = new StringBuilder("[");
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                json.append(", ");
            }
            json.append(formatValue(Arrays.setAll(array, i)));
        }
        json.append("]");
        return json.toString();
    }
}

// Sample class to test JSON conversion
class Person {
    private String name;
    private int age;
    private boolean isStudent;
    private List<String> hobbies;
    private int[] scores;

    public Person(String name, int age, boolean isStudent, List<String> hobbies, int[] scores) {
        this.name = name;
        this.age = age;
        this.isStudent = isStudent;
        this.hobbies = hobbies;
        this.scores = scores;
    }
}

// Main class to test JSON conversion


public class JsonTest {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25, true, Arrays.asList("Reading", "Cycling"), new int[]{90, 85, 88});

        String json = JsonSerializer.toJson(person);
        System.out.println(json);
    }
}*/
