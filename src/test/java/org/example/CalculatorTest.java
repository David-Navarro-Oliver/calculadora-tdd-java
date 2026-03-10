package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @Test
    void shouldAddTwoPositiveNumbers() {
        Calculator calculator = new Calculator();

        double result = calculator.add(10, 5);

        assertEquals(15, result);
    }

    @Test
    void shouldAddPositiveAndNegativeNumbers() {
        Calculator calculator = new Calculator();

        double result = calculator.add(10, -5);

        assertEquals(5, result);
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

    @Test
    void shouldDivideTwoPositiveNumbers() {
        Calculator calculator = new Calculator();

        double result = calculator.divide(10, 5);

        assertEquals(2, result);
    }

    @Test
    void shouldThrowExceptionWhenDividingByZero() {
        Calculator calculator = new Calculator();

        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }
}