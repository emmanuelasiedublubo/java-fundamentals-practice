package conditionals;

/*
 * Program: EvenOddChecker
 * Module: Conditionals
 * Purpose: Determines whether a number is even or odd.
 */

public class EvenOddChecker {

    public static void main(String[] args) {

        int number = 18;

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }

}