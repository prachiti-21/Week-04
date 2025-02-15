package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    private final UserRegistration registration = new UserRegistration();

    @Test
    public void testValidRegistration() {
        assertDoesNotThrow(() -> registration.registerUser("JohnDoe", "john.doe@example.com", "Password123"),
                "Valid registration should not throw an exception");
    }

    @Test
    public void testEmptyUsername() {
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("", "user@example.com", "Password123"),
                "Empty username should throw an exception");
    }

    @Test
    public void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("JohnDoe", "invalid-email", "Password123"),
                "Invalid email should throw an exception");
    }

    @Test
    public void testShortPassword() {
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("JohnDoe", "user@example.com", "short"),
                "Short password should throw an exception");
    }

    @Test
    public void testNullValues() {
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser(null, "user@example.com", "Password123"),
                "Null username should throw an exception");

        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("JohnDoe", null, "Password123"),
                "Null email should throw an exception");

        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("JohnDoe", "user@example.com", null),
                "Null password should throw an exception");
    }
}
