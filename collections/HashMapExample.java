package collections;

import java.util.HashMap;

/*
 * Program: HashMapExample
 * Module: Collections
 * Purpose: Demonstrates how a HashMap stores data
 * using key-value pairs.
 */

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Emmanuel", 85);
        studentScores.put("Ama", 92);
        studentScores.put("Kwame", 78);
        studentScores.put("Akosua", 88);

        System.out.println("Student Scores: " + studentScores);
        System.out.println("Emmanuel's Score: " + studentScores.get("Emmanuel"));
        System.out.println("Number of Students: " + studentScores.size());
    }
}
