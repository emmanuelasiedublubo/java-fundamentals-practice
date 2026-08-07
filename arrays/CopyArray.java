package arrays;

/*
 * Program: CopyArray
 * Module: Arrays
 * Purpose: Copies all elements from one integer array into another array.
 */

public class CopyArray {

    public static void main(String[] args) {

        int[] original = {10, 20, 30, 40, 50};
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        System.out.println("Copied array:");

        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }

    }

}