package exceptionhandling;

/*
 * Program: BasicTryCatch
 * Module: Exception Handling
 * Purpose: Demonstrates how try and catch can be used
 * to handle an exception without crashing the program.
 */

public class BasicTryCatch {

    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("An arithmetic error occurred.");
        }

        System.out.println("Program continues running.");
    }
}