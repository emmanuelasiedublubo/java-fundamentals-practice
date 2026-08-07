package exceptionhandling;

/*
 * Program: NumberFormatExceptionExample
 * Module: Exception Handling
 * Purpose: Demonstrates how to handle an error that occurs
 * when an invalid String is converted into an integer.
 */

public class NumberFormatExceptionExample {

    public static void main(String[] args) {

        String value = "Hello";

        try {
            int number = Integer.parseInt(value);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Cannot convert the text to a number.");
        }

        System.out.println("Program continues running.");
    }
}