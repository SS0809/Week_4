package org.filehandling.readalargefile;
public class Main {
    public static void main(String[] args) {
        String fileName = "D:\\CapgTrainingAssignments\\errordoc.txt";
        LargeFileReader object=new LargeFileReader();
        object.readLargeFiles(fileName);
    }
}