package exceptionhandling;

/*
 * Program: ThrowsExample
 * Module: Exception Handling
 * Purpose: Demonstrates how the throws keyword can declare
 * that a method may produce an exception.
 */

public class ThrowsExample {

    public static void divide(int firstNumber, int secondNumber)
            throws ArithmeticException {

        int result = firstNumber / secondNumber;

        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {

        try {

            divide(20, 0);

        } catch (ArithmeticException e) {

            System.out.println("Error: Cannot divide by zero.");

        }
    }
}