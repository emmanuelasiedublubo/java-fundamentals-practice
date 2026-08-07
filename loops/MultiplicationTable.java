package loops;

/*
 * Program: MultiplicationTable
 * Module: Loops
 * Purpose: Displays the multiplication table for a given number.
 */

public class MultiplicationTable {

    public static void main(String[] args) {

        int number = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

    }

}
