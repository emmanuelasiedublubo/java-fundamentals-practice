package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Program: StudentRecordFile
 * Module: File Handling
 * Purpose: Demonstrates how to write student information
 * to a file and then read the information from the file.
 */

public class StudentRecordFile {

    public static void main(String[] args) {

        String fileName = "student_record.txt";

        try {

            FileWriter writer = new FileWriter(fileName);

            writer.write("Name: Emmanuel\n");
            writer.write("Program: MSc Information Technology\n");
            writer.write("Course: Java Programming\n");
            writer.write("Score: 85\n");

            writer.close();

            System.out.println("Student record saved successfully.");

            File file = new File(fileName);
            Scanner reader = new Scanner(file);

            System.out.println("\nStudent Record:");

            while (reader.hasNextLine()) {

                String data = reader.nextLine();
                System.out.println(data);

            }

            reader.close();

        } catch (IOException e) {

            System.out.println("An error occurred.");
            e.printStackTrace();

        }
    }
}