package exceptionhandling;

/*
 * Program: ThrowExample
 * Module: Exception Handling
 * Purpose: Demonstrates how the throw keyword can be used
 * to manually generate an exception.
 */

public class ThrowExample {

    public static void checkAge(int age) {

        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above.");
        }

        System.out.println("Access granted.");
    }

    public static void main(String[] args) {

        try {

            checkAge(16);

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());

        }
    }
}