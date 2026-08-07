package conditionals;

/*
 * Program: PositiveNegativeChecker
 * Module: Conditionals
 * Purpose: Determines whether a number is positive, negative, or zero.
 */

public class PositiveNegativeChecker {

    public static void main(String[] args) {

        int number = -15;

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

    }

}
