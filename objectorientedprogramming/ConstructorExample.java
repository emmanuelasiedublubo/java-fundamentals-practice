package objectorientedprogramming;

/*
 * Program: ConstructorExample
 * Module: Object-Oriented Programming
 * Purpose: Demonstrates how a constructor initializes
 * an object's attributes when the object is created.
 */

public class ConstructorExample {

    String name;
    int age;

    public ConstructorExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        ConstructorExample student = new ConstructorExample("Micheal",35);

        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
    }
}
