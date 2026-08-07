package methods;

/*
 * Program: GreetingMethod
 * Module: Methods
 * Purpose: Demonstrates how to pass a value to a Java method using a parameter.
 */

public class GreetingMethod {

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {

        greet("Emmanuel");

    }

}