package objectorientedprogramming;

/*
 * Program: CarObject
 * Module: Object-Oriented Programming
 * Purpose: Demonstrates creating multiple objects from the same class.
 */

public class CarObject {

    String brand;
    String model;
    int year;

    public static void main(String[] args) {

        CarObject car1 = new CarObject();
        CarObject car2 = new CarObject();

        car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.year = 2022;

        car2.brand = "Honda";
        car2.model = "Civic";
        car2.year = 2023;

        System.out.println("Car 1: " + car1.brand + " " + car1.model + " " + car1.year);
        System.out.println("Car 2: " + car2.brand + " " + car2.model + " " + car2.year);
    }
}
