package exceptionhandling;

/*
 * Program: CustomExceptionExample
 * Module: Exception Handling
 * Purpose: Demonstrates how to create and use
 * a custom exception in Java.
 */

class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {

    public static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }

        System.out.println("Access granted.");
    }

    public static void main(String[] args) {

        try {

            checkAge(16);

        } catch (InvalidAgeException e) {

            System.out.println("Error: " + e.getMessage());

        }
    }
}