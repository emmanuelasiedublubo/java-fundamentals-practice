package methods;

/*
 * Program: AddNumbersMethod
 * Module: Methods
 * Purpose: Demonstrates how a Java method can receive two parameters
 * and return a calculated value.
 */

public class AddNumbersMethod {

    public static int addNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static void main(String[] args) {

        int result = addNumbers(10, 20);

        System.out.println("Sum: " + result);

    }

}