package org.filehandling.efficientfilecopy;

public class Main {
    public static void main(String[] args) {
        String sourceFile = "D:\\CapgTrainingAssignments\\info.txt";
        String destinationFileBuffered = "D:\\CapgTrainingAssignments\\destinationBuffered.txt";
        String destinationFileUnbuffered = "D:\\CapgTrainingAssignments\\destinationUnbuffered.txt";

        FileCopyBuffered bufferedCopy = new FileCopyBuffered();
        long startTimeBuffered = System.nanoTime();
        bufferedCopy.copyFile(sourceFile, destinationFileBuffered);
        long endTimeBuffered = System.nanoTime();
        long durationBuffered = endTimeBuffered - startTimeBuffered;

        FileCopyUnbuffered unbufferedCopy = new FileCopyUnbuffered();
        long startTimeUnbuffered = System.nanoTime();
        unbufferedCopy.copyFile(sourceFile, destinationFileUnbuffered);
        long endTimeUnbuffered = System.nanoTime();
        long durationUnbuffered = endTimeUnbuffered - startTimeUnbuffered;

        System.out.println("Buffered Stream copy time: " + durationBuffered + " nanoseconds");
        System.out.println("Unbuffered Stream copy time: " + durationUnbuffered + " nanoseconds");
    }
}
