package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Program: ReadMultipleLines
 * Module: File Handling
 * Purpose: Demonstrates how to read multiple lines
 * of text from a file in Java.
 */

public class ReadMultipleLines {

    public static void main(String[] args) {

        try {

            File file = new File("courses.txt");
            Scanner reader = new Scanner(file);

            System.out.println("Courses:");

            while (reader.hasNextLine()) {

                String data = reader.nextLine();
                System.out.println(data);

            }

            reader.close();

        } catch (FileNotFoundException e) {

            System.out.println("File not found.");

        }
    }
}