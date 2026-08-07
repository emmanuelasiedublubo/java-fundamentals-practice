package objectorientedprogramming;

/*
 * Program: InheritanceExample
 * Module: Object-Oriented Programming
 * Purpose: Demonstrates inheritance by allowing a child class
 * to inherit attributes and methods from a parent class.
 */

class Animal {

    String name = "Dog";

    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

public class InheritanceExample extends Animal {

    public static void main(String[] args) {

        InheritanceExample animal = new InheritanceExample();

        System.out.println("Animal: " + animal.name);
        animal.makeSound();
    }
}