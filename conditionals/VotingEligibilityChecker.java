package conditionals;

/*
 * Program: VotingEligibilityChecker
 * Module: Conditionals
 * Purpose: Determines whether a person is eligible to vote based on age.
 */

public class VotingEligibilityChecker {

    public static void main(String[] args) {

        int age = 20;

        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

    }

}