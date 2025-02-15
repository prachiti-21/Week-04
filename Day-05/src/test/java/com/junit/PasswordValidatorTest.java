package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
    private final PasswordValidator validator = new PasswordValidator();

    @Test
    public void testValidPassword() {
        assertTrue(validator.isValid("StrongPass1"), "Valid password should pass");
    }

    @Test
    public void testShortPassword() {
        assertFalse(validator.isValid("Abc1"), "Password with less than 8 characters should fail");
    }

    @Test
    public void testNoUpperCasePassword() {
        assertFalse(validator.isValid("lowercase1"), "Password without an uppercase letter should fail");
    }

    @Test
    public void testNoDigitPassword() {
        assertFalse(validator.isValid("NoDigitsHere"), "Password without a digit should fail");
    }

    @Test
    public void testNullPassword() {
        assertFalse(validator.isValid(null), "Null password should fail");
    }

    @Test
    public void testEmptyPassword() {
        assertFalse(validator.isValid(""), "Empty password should fail");
    }
}
