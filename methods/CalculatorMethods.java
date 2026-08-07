package methods;

/*
 * Program: CalculatorMethods
 * Module: Methods
 * Purpose: Demonstrates multiple reusable methods for basic arithmetic operations.
 */

public class CalculatorMethods {

    public static double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public static double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double divide(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {

        double firstNumber = 20;
        double secondNumber = 5;

        System.out.println("Addition: " + add(firstNumber, secondNumber));
        System.out.println("Subtraction: " + subtract(firstNumber, secondNumber));
        System.out.println("Multiplication: " + multiply(firstNumber, secondNumber));
        System.out.println("Division: " + divide(firstNumber, secondNumber));

    }

}