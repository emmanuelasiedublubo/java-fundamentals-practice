package objectorientedprogramming;

/*
 * Program: InterfaceExample
 * Module: Object-Oriented Programming
 * Purpose: Demonstrates how a class implements an interface
 * and provides an implementation for its method.
 */

interface Payment {

    void makePayment();
}

public class InterfaceExample implements Payment {

    @Override
    public void makePayment() {
        System.out.println("Payment completed successfully.");
    }

    public static void main(String[] args) {

        InterfaceExample payment = new InterfaceExample();

        payment.makePayment();
    }
}