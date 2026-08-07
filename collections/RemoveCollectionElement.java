package collections;

import java.util.ArrayList;

/*
 * Program: RemoveCollectionElement
 * Module: Collections
 * Purpose: Demonstrates how to remove an element
 * from an ArrayList using the remove() method.
 */

public class RemoveCollectionElement {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println("Before Removal: " + fruits);

        fruits.remove("Banana");

        System.out.println("After Removal: " + fruits);
    }
}