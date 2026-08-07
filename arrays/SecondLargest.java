package arrays;

/*
 * Program: SecondLargest
 * Module: Arrays
 * Purpose: Finds the second largest value in an integer array.
 */

public class SecondLargest {

    public static void main(String[] args) {

        int[] numbers = {12, 45, 7, 89, 34};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }

        }

        System.out.println("Second Largest: " + secondLargest);

    }

}