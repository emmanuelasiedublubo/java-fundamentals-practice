package exceptionhandling;

/*
 * Program: FinallyExample
 * Module: Exception Handling
 * Purpose: Demonstrates how the finally block executes
 * whether an exception occurs or not.
 */

public class FinallyExample {

    public static void main(String[] args) {

        try {

            int result = 10 / 0;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            System.out.println("Error: Cannot divide by zero.");

        } finally {

            System.out.println("Finally block executed.");

        }

        System.out.println("Program continues running.");
    }
}