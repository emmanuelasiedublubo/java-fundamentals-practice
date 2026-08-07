package collections;

import java.util.HashMap;
import java.util.Map;

/*
 * Program: StudentGradeManager
 * Module: Collections
 * Purpose: Demonstrates how a HashMap can store student names
 * and scores and how the collection can be processed using methods.
 */

public class StudentGradeManager {

    public static String getGrade(int score) {

        if (score >= 80) {
            return "A";
        } else if (score >= 70) {
            return "B";
        } else if (score >= 60) {
            return "C";
        } else if (score >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {

        HashMap<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Emmanuel", 85);
        studentScores.put("Ama", 72);
        studentScores.put("Kwame", 64);
        studentScores.put("Akosua", 91);

        System.out.println("Student Results:");

        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {

            String name = entry.getKey();
            int score = entry.getValue();

            System.out.println(
                name + " - Score: " + score + " - Grade: " + getGrade(score)
            );
        }
    }
}