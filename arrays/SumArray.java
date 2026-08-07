package arrays;

/*
 * Program: SumArray
 * Module: Arrays
 * Purpose: Calculates the sum of all elements in an integer array.
 */

public class SumArray {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Sum: " + sum);

    }

}