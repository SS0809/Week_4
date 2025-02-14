package org.myexceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//5. try-with-resources (Auto-closing Resources)
//💡 Problem Statement:
//Write a Java program that reads the first line of a file named "info.txt" using BufferedReader.
//Use try-with-resources to ensure the file is automatically closed after reading.
//Handle any IOException that may occur.
//Expected Behavior:
//If the file exists, print its first line.
//If the file does not exist, catch IOException and print "Error reading file".
public class TryWithResources {
    void tryWith(){
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.err.println("Error reading file.\nError: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        TryWithResources tr = new TryWithResources();
        tr.tryWith();

    }
}
