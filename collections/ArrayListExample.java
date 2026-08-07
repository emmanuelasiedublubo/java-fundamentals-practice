package collections;

import java.util.ArrayList;

/*
 * Program: ArrayListExample
 * Module: Collections
 * Purpose: Demonstrates how to create an ArrayList,
 * add elements, and access stored values.
 */

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("R");

        System.out.println("Programming Languages: " + languages);
        System.out.println("First Language: " + languages.get(0));
        System.out.println("Number of Languages: " + languages.size());
    }
}