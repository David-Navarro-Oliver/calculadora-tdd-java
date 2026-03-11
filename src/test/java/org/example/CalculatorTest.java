package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void shouldAddTwoPositiveNumbers() {
        double result = calculator.add(10, 5);

        assertEquals(15, result);
    }

    @Test
    void shouldAddPositiveAndNegativeNumbers() {
        double result = calculator.add(10, -5);

        assertEquals(5, result);
    }

    @Test
    void shouldSubtractTwoPositiveNumbers() {
        double result = calculator.subtract(10, 5);

        assertEquals(5, result);
    }

    @Test
    void shouldReturnNegativeResultWhenSecondNumberIsGreaterInSubtraction() {
        double result = calculator.subtract(5, 10);

        assertEquals(-5, result);
    }

    @Test
    void shouldMultiplyTwoPositiveNumbers() {
        double result = calculator.multiply(10, 5);

        assertEquals(50, result);
    }

    @Test
    void shouldReturnZeroWhenMultiplyingByZero() {
        double result = calculator.multiply(10, 0);

        assertEquals(0, result);
    }

    @Test
    void shouldDivideTwoPositiveNumbers() {
        double result = calculator.divide(10, 5);

        assertEquals(2, result);
    }

    @Test
    void shouldReturnDecimalResultWhenDivisionIsNotExact() {
        double result = calculator.divide(7, 2);

        assertEquals(3.5, result);
    }

    @Test
    void shouldThrowExceptionWhenDividingByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }
}