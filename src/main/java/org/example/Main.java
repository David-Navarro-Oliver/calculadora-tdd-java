package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double firstNumber = 10;
        double secondNumber = 5;

        System.out.println("Addition: " + calculator.add(firstNumber, secondNumber));
        System.out.println("Subtraction: " + calculator.subtract(firstNumber, secondNumber));
        System.out.println("Multiplication: " + calculator.multiply(firstNumber, secondNumber));
        System.out.println("Division: " + calculator.divide(firstNumber, secondNumber));
    }
}