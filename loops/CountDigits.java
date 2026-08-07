package loops;

/*
 * Program: CountDigits
 * Module: Loops
 * Purpose: Counts the number of digits in an integer using a while loop.
 */

public class CountDigits {

    public static void main(String[] args) {

        int number = 123456;
        int count = 0;

        while (number != 0) {
            number /= 10;
            count++;
        }

        System.out.println("Number of digits = " + count);

    }

}