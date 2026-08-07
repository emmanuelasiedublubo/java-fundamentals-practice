package collections;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Program: SortArrayList
 * Module: Collections
 * Purpose: Demonstrates how to sort elements
 * in an ArrayList using Collections.sort().
 */

public class SortArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Before Sorting: " + numbers);

        Collections.sort(numbers);

        System.out.println("After Sorting: " + numbers);
    }
}
