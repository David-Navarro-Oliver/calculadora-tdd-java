package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void shouldAddTwoPositiveNumbers() {
        Calculator calculator = new Calculator();

        double result = calculator.add(10, 5);

        assertEquals(15, result);
    }

    @Test
    void shouldSubtractTwoPositiveNumbers() {
        Calculator calculator = new Calculator();

        double result = calculator.subtract(10, 5);

        assertEquals(5, result);
    }

    @Test
    void shouldMultiplyTwoPositiveNumbers() {
        Calculator calculator = new Calculator();

        double result = calculator.multiply(10, 5);

        assertEquals(50, result);
    }
}