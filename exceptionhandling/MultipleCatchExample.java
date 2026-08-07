package exceptionhandling;

/*
 * Program: MultipleCatchExample
 * Module: Exception Handling
 * Purpose: Demonstrates how multiple catch blocks can handle
 * different types of exceptions.
 */

public class MultipleCatchExample {

    public static void main(String[] args) {

        String value = "Hello";

        try {

            int number = Integer.parseInt(value);
            int result = 10 / number;

            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {

            System.out.println("Error: Invalid number format.");

        } catch (ArithmeticException e) {

            System.out.println("Error: Cannot divide by zero.");

        }

        System.out.println("Program continues running.");
    }
}
