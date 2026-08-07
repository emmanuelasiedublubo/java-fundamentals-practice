package objectorientedprogramming;

/*
 * Program: PolymorphismExample
 * Module: Object-Oriented Programming
 * Purpose: Demonstrates polymorphism by using a parent class
 * reference to access different child class behaviors.
 */

class Shape {

    public void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class PolymorphismExample {

    public static void main(String[] args) {

        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        shape1.draw();
        shape2.draw();
    }
}