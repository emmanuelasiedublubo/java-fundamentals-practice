package collections;

import java.util.HashSet;

/*
 * Program: HashSetExample
 * Module: Collections
 * Purpose: Demonstrates how a HashSet stores unique elements
 * and prevents duplicate values.
 */

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> countries = new HashSet<>();

        countries.add("Ghana");
        countries.add("Nigeria");
        countries.add("Kenya");
        countries.add("Ghana");

        System.out.println("Countries: " + countries);
        System.out.println("Number of Countries: " + countries.size());
        System.out.println("Contains Ghana: " + countries.contains("Ghana"));
    }
}
