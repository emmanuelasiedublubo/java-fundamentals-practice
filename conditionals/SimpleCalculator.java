package conditionals;

/*
 * Program: SimpleCalculator
 * Module: Conditionals
 * Purpose: Performs a basic arithmetic operation based on the selected operator.
 */

public class SimpleCalculator {

    public static void main(String[] args) {

        double num1 = 20;
        double num2 = 5;
        char operator = '+';

        if (operator == '+') {
            System.out.println("Result: " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Result: " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("Result: " + (num1 * num2));
        } else if (operator == '/') {

            if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
            } else {
                System.out.println("Cannot divide by zero.");
            }

        } else {
            System.out.println("Invalid operator.");
        }

    }

}