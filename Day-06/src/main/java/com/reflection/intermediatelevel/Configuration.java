package com.reflection.intermediatelevel;

import java.lang.reflect.*;

public class Configuration {
    private static int API_KEY=123;

    public static int getApiKey(){
        return API_KEY;
    }
}
class Modify{
    public static void main(String[] args) {
        try {
            // Get the Configuration class object
            Class<?> clazz = Configuration.class;

            // Get the private static field "API_KEY"
            Field apiKeyField = clazz.getDeclaredField("API_KEY");

            // Make the field accessible (bypass private modifier)
            apiKeyField.setAccessible(true);

            // Modify the value of the static field
            apiKeyField.set(null, 456);

            // Verify the change
            System.out.println("Modified API_KEY: " + Configuration.getApiKey());

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
