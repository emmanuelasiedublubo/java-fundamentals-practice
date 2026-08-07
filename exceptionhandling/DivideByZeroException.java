package exceptionhandling;

/*
 * Program: DivideByZeroException
 * Module: Exception Handling
 * Purpose: Demonstrates how to handle division by zero
 * using an ArithmeticException.
 */

public class DivideByZeroException {

    public static void main(String[] args) {

        int firstNumber = 20;
        int secondNumber = 0;

        try {
            int result = firstNumber / secondNumber;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}