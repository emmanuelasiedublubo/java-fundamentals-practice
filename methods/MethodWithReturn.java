package methods;

/*
 * Program: MethodWithReturn
 * Module: Methods
 * Purpose: Demonstrates a method that returns a String value.
 */

public class MethodWithReturn {

    public static String getMessage() {
        return "Java methods are reusable!";
    }

    public static void main(String[] args) {

        String message = getMessage();

        System.out.println(message);

    }

}