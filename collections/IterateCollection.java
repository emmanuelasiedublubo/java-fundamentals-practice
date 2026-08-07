package collections;

import java.util.ArrayList;

/*
 * Program: IterateCollection
 * Module: Collections
 * Purpose: Demonstrates how to iterate through
 * an ArrayList using an enhanced for loop.
 */

public class IterateCollection {

    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("Database");
        courses.add("Networking");
        courses.add("Artificial Intelligence");

        System.out.println("Courses:");

        for (String course : courses) {
            System.out.println(course);
        }
    }
}