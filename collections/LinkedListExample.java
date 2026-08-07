package collections;

import java.util.LinkedList;

/*
 * Program: LinkedListExample
 * Module: Collections
 * Purpose: Demonstrates how to create a LinkedList,
 * add elements, and access stored values.
 */

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> students = new LinkedList<>();

        students.add("Emmanuel");
        students.add("Ama");
        students.add("Kwame");
        students.add("Akosua");

        System.out.println("Students: " + students);
        System.out.println("First Student: " + students.getFirst());
        System.out.println("Last Student: " + students.getLast());
        System.out.println("Number of Students: " + students.size());
    }
}