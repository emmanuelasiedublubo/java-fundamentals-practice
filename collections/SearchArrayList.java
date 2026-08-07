package collections;

import java.util.ArrayList;

/*
 * Program: SearchArrayList
 * Module: Collections
 * Purpose: Demonstrates how to search for an element
 * in an ArrayList using the contains() method.
 */

public class SearchArrayList {

    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("R");

        String searchLanguage = "Python";

        if (languages.contains(searchLanguage)) {
            System.out.println(searchLanguage + " was found.");
        } else {
            System.out.println(searchLanguage + " was not found.");
        }
    }
}