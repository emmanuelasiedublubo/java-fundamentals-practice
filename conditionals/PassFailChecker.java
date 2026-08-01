package conditionals;

/*
 * Program: PassFailChecker
 * Module: Conditionals
 * Purpose: Determines whether a student has passed or failed based on their exam score.
 */

public class PassFailChecker {

    public static void main(String[] args) {

        int score = 75;

        if (score >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

    }

}