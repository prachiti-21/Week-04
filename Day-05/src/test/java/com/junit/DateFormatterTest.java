package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {
    private final DateFormatter formatter = new DateFormatter();

    @Test
    public void testValidDateFormat() {
        assertEquals("15-02-2025", formatter.formatDate("2025-02-15"), "Valid date should be formatted correctly");
    }

    @Test
    public void testInvalidDateFormat() {
        assertThrows(IllegalArgumentException.class, () -> formatter.formatDate("15-02-2025"), "Should throw exception for invalid format");
    }

    @Test
    public void testEmptyDate() {
        assertThrows(IllegalArgumentException.class, () -> formatter.formatDate(""), "Should throw exception for empty date");
    }

    @Test
    public void testNullDate() {
        assertThrows(IllegalArgumentException.class, () -> formatter.formatDate(null), "Should throw exception for null date");
    }
}
