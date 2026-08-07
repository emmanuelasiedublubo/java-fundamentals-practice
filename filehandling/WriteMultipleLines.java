package filehandling;

import java.io.FileWriter;
import java.io.IOException;

/*
 * Program: WriteMultipleLines
 * Module: File Handling
 * Purpose: Demonstrates how to write multiple lines
 * of text to a file in Java.
 */

public class WriteMultipleLines {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("courses.txt");

            writer.write("Java Programming\n");
            writer.write("Database Management\n");
            writer.write("Computer Networking\n");
            writer.write("Artificial Intelligence\n");

            writer.close();

            System.out.println("Multiple lines written successfully.");

        } catch (IOException e) {

            System.out.println("An error occurred.");
            e.printStackTrace();

        }
    }
}