package methods;

/*
 * Program: EvenOddMethod
 * Module: Methods
 * Purpose: Uses a method to determine whether an integer is even or odd.
 */

public class EvenOddMethod {

    public static void checkEvenOdd(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }

    }

    public static void main(String[] args) {

        checkEvenOdd(18);

    }

}