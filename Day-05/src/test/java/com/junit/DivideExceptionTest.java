package com.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideExceptionTest {
    private final DivideException divideException = new DivideException();

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> divideException.divide(10, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}