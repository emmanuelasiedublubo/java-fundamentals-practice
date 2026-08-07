package loops;

/*
 * Program: FibonacciSeries
 * Module: Loops
 * Purpose: Prints the first 10 numbers in the Fibonacci sequence.
 */

public class FibonacciSeries {

    public static void main(String[] args) {

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= 10; i++) {

            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;

        }

    }

}