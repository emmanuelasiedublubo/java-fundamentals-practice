package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Program: CopyFileExample
 * Module: File Handling
 * Purpose: Demonstrates how to copy text
 * from one file into another file.
 */

public class CopyFileExample {

    public static void main(String[] args) {

        try {

            File sourceFile = new File("courses.txt");
            Scanner reader = new Scanner(sourceFile);

            FileWriter writer = new FileWriter("courses_copy.txt");

            while (reader.hasNextLine()) {

                String data = reader.nextLine();
                writer.write(data + "\n");

            }

            reader.close();
            writer.close();

            System.out.println("File copied successfully.");

        } catch (IOException e) {

            System.out.println("An error occurred.");
            e.printStackTrace();

        }
    }
}
