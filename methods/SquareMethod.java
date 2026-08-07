package methods;

/*
 * Program: SquareMethod
 * Module: Methods
 * Purpose: Uses a method to calculate and return the square of a number.
 */

public class SquareMethod {

    public static int calculateSquare(int number) {
        return number * number;
    }

    public static void main(String[] args) {

        int result = calculateSquare(8);

        System.out.println("Square: " + result);

    }

}