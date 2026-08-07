package exceptionhandling;

/*
 * Program: ArrayIndexException
 * Module: Exception Handling
 * Purpose: Demonstrates how to handle an attempt to access
 * an array position that does not exist.
 */

public class ArrayIndexException {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.println(numbers[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }

        System.out.println("Program continues running.");
    }
}