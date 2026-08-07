package arrays;

/*
 * Program: MinimumArray
 * Module: Arrays
 * Purpose: Finds the smallest value in an integer array.
 */

public class MinimumArray {

    public static void main(String[] args) {

        int[] numbers = {12, 45, 7, 89, 34};

        int minimum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }

        }

        System.out.println("Minimum: " + minimum);

    }

}
