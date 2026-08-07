package conditionals;

/*
 * Program: SmallestNumberChecker
 * Module: Conditionals
 * Purpose: Determines the smallest of three numbers.
 */

public class SmallestNumberChecker {

    public static void main(String[] args) {

        int num1 = 25;
        int num2 = 40;
        int num3 = 18;

        if (num1 <= num2 && num1 <= num3) {
            System.out.println("Smallest Number: " + num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("Smallest Number: " + num2);
        } else {
            System.out.println("Smallest Number: " + num3);
        }

    }

}