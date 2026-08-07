package objectorientedprogramming;

/*
 * Program: AbstractClassExample
 * Module: Object-Oriented Programming
 * Purpose: Demonstrates abstraction using an abstract class
 * and an abstract method implemented by a child class.
 */

abstract class Employee {

    abstract void work();

    public void displayMessage() {
        System.out.println("Employee is working.");
    }
}

public class AbstractClassExample extends Employee {

    @Override
    void work() {
        System.out.println("Software Developer writes code.");
    }

    public static void main(String[] args) {

        AbstractClassExample developer = new AbstractClassExample();

        developer.work();
        developer.displayMessage();
    }
}
