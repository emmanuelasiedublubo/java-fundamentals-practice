package loops;

/*
 * Program: FactorialCalculator
 * Module: Loops
 * Purpose: Calculates the factorial of a given number using a for loop.
 */

public class FactorialCalculator {

    public static void main(String[] args) {

        int number = 5;
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " = " + factorial);

    }

}