package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Program: ReadFileExample
 * Module: File Handling
 * Purpose: Demonstrates how to read text from a file in Java.
 */

public class ReadFileExample {

    public static void main(String[] args) {

        try {

            File file = new File("example.txt");
            Scanner reader = new Scanner(file);

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