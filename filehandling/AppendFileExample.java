package filehandling;

import java.io.FileWriter;
import java.io.IOException;

/*
 * Program: AppendFileExample
 * Module: File Handling
 * Purpose: Demonstrates how to add new text to an existing file
 * without deleting the file's current contents.
 */

public class AppendFileExample {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("example.txt", true);

            writer.write("\nThis line was appended to the file.");

            writer.close();

            System.out.println("Successfully appended text to the file.");

        } catch (IOException e) {

            System.out.println("An error occurred.");
            e.printStackTrace();

        }
    }
}
