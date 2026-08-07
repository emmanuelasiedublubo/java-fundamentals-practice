package switchstatements;

/*
 * Program: SimpleCalculatorSwitch
 * Module: Switch Statements
 * Purpose: Uses a switch statement to perform
 * basic arithmetic operations.
 */

public class SimpleCalculatorSwitch {

    public static void main(String[] args) {

        double firstNumber = 20;
        double secondNumber = 5;
        char operator = '*';

        switch (operator) {

            case '+':
                System.out.println("Result: " + (firstNumber + secondNumber));
                break;

            case '-':
                System.out.println("Result: " + (firstNumber - secondNumber));
                break;

            case '*':
                System.out.println("Result: " + (firstNumber * secondNumber));
                break;

            case '/':
                if (secondNumber != 0) {
                    System.out.println("Result: " + (firstNumber / secondNumber));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid operator");
        }
    }
}