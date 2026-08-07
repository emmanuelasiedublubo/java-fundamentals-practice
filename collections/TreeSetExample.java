package collections;

import java.util.TreeSet;

/*
 * Program: TreeSetExample
 * Module: Collections
 * Purpose: Demonstrates how a TreeSet stores unique
 * elements in sorted order.
 */

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);

        System.out.println("Numbers: " + numbers);
        System.out.println("Smallest Number: " + numbers.first());
        System.out.println("Largest Number: " + numbers.last());
        System.out.println("Number of Elements: " + numbers.size());
    }
}