package methods;

/*
 * Program: MaximumMethod
 * Module: Methods
 * Purpose: Uses a method to determine the larger of two integers.
 */

public class MaximumMethod {

    public static int findMaximum(int firstNumber, int secondNumber) {

        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }

    }

    public static void main(String[] args) {

        int maximum = findMaximum(45, 72);

        System.out.println("Maximum: " + maximum);

    }

}