package com.junit;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {
    private final NumberUtils numberUtils = new NumberUtils();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    public void testIsEven(int number) {
        boolean expected = (number % 2 == 0);
        assertEquals(expected, numberUtils.isEven(number), "Failed for number: " + number);
    }
}