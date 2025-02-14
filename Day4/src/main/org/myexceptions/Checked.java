package main.org.myexceptions;

import java.io.*;

//1. Checked Exception (Compile-time Exception)
//💡 Problem Statement:
//Create a Java program that reads a file named "data.txt". If the file does not exist, handle the IOException properly and display a user-friendly message.
//Expected Behavior:
//If the file exists, print its contents.
//If the file does not exist, catch the IOException and print "File not found".
public class Checked {
    public static void main(String[] args) {
        try {
            File fl = new File("input.txt");
            BufferedReader f = new BufferedReader(new FileReader(fl));
            String line ;
            while ((line= f.readLine())!=null) {
                System.out.print(line);
            }
        }catch (IOException e){
            System.out.println("File not found");
        }
    }
}
