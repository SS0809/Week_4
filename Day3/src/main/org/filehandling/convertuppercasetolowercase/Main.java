package org.filehandling.convertuppercasetolowercase;import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "D:\\CapgTrainingAssignments\\input.txt";
        String outputFilePath = "D:\\CapgTrainingAssignments\\output.txt";
        FileConverter converter = new FileConverter();

        try {
            converter.convertFileToLowercase(inputFilePath, outputFilePath);
            System.out.println("File has been converted to lowercase and saved as " + outputFilePath);
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}

