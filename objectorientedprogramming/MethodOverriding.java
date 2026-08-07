package objectorientedprogramming;

/*
 * Program: MethodOverriding
 * Module: Object-Oriented Programming
 * Purpose: Demonstrates method overriding by allowing a child class
 * to provide its own version of a parent class method.
 */

class Vehicle {

    public void displayType() {
        System.out.println("This is a vehicle.");
    }
}

public class MethodOverriding extends Vehicle {

    @Override
    public void displayType() {
        System.out.println("This is a car.");
    }

    public static void main(String[] args) {

        MethodOverriding car = new MethodOverriding();

        car.displayType();
    }
}