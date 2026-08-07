package filehandling;

import java.io.FileWriter;
import java.io.IOException;

/*
 * Program: WriteFileExample
 * Module: File Handling
 * Purpose: Demonstrates how to write text to a file in Java.
 */

public class WriteFileExample {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("example.txt");

            writer.write("Hello! This text was written using Java.");

            writer.close();

            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {

            System.out.println("An error occurred.");
            e.printStackTrace();

        }
    }
}
