package conditionals;

/*
 * Program: DivisibilityChecker
 * Module: Conditionals
 * Purpose: Checks whether a number is divisible by 5 and 3.
 */

public class DivisibilityChecker {

    public static void main(String[] args) {

        int number = 30;

        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println(number + " is divisible by both 5 and 3.");
        } else if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5 only.");
        } else if (number % 3 == 0) {
            System.out.println(number + " is divisible by 3 only.");
        } else {
            System.out.println(number + " is not divisible by either 3 or 5.");
        }

    }

}