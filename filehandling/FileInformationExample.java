package filehandling;

import java.io.File;

/*
 * Program: FileInformationExample
 * Module: File Handling
 * Purpose: Demonstrates how to retrieve information
 * about a file in Java.
 */

public class FileInformationExample {

    public static void main(String[] args) {

        File file = new File("student.txt");

        if (file.exists()) {

            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File Size: " + file.length() + " bytes");

        } else {

            System.out.println("The file does not exist.");

        }
    }
}
