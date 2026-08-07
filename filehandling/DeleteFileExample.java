package filehandling;

import java.io.File;

/*
 * Program: DeleteFileExample
 * Module: File Handling
 * Purpose: Demonstrates how to delete a file in Java.
 */

public class DeleteFileExample {

    public static void main(String[] args) {

        File file = new File("example.txt");

        if (file.delete()) {
            System.out.println("File deleted successfully: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}