package methods;

/*
 * Program: MethodOverloading
 * Module: Methods
 * Purpose: Demonstrates method overloading by creating methods
 * with the same name but different parameters.
 */

public class MethodOverloading {

    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static void main(String[] args) {

        int integerResult = add(10, 20);
        double decimalResult = add(5.5, 4.5);

        System.out.println("Integer Sum: " + integerResult);
        System.out.println("Decimal Sum: " + decimalResult);

    }

}