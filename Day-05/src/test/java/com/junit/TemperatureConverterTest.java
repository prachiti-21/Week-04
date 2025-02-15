package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {
    private final TemperatureConverter converter = new TemperatureConverter();

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.01, "0°C should be 32°F");
        assertEquals(98.6, converter.celsiusToFahrenheit(37), 0.01, "37°C should be 98.6°F");
        assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.01, "100°C should be 212°F");
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.01, "32°F should be 0°C");
        assertEquals(37.0, converter.fahrenheitToCelsius(98.6), 0.01, "98.6°F should be 37°C");
        assertEquals(100.0, converter.fahrenheitToCelsius(212), 0.01, "212°F should be 100°C");
    }
}
