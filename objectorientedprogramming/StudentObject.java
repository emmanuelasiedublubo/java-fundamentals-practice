package objectorientedprogramming;

/*
 * Program: StudentObject
 * Module: Object-Oriented Programming
 * Purpose: Demonstrates how to create a class, define attributes,
 * create an object, and access its data.
 */

public class StudentObject {

    String name;
    int age;
    String program;

    public static void main(String[] args) {

        StudentObject student = new StudentObject();

        student.name = "Micheal";
        student.age = 35;
        student.program = "MSc Information Technology";

        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Program: " + student.program);
    }
}