package org.filehandling.readandwritetextfile;

public class Main {
    public static void main(String[] args) {
        ReadAndWrite fileHandler = new ReadAndWrite();
        String sourceFile = "D:\\CapgTrainingAssignments\\source.txt";
        String destinationFile = "D:\\CapgTrainingAssignments\\destination.txt";
        fileHandler.copyFile(sourceFile, destinationFile);
    }
}
