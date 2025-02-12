package org.collections1.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.List;

public class GeneratoQueue {
    public static List<String> generateBinaryNumbers(int n) {
        if (n <= 0) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");
        while (result.size() < n) {
            String current = queue.poll();
            result.add(current);
            queue.offer(current + "0");
            queue.offer(current + "1");
        }
        return result;
    }
    public static void main(String[] args) {
        int[] testCases = {5, 3, 1, 0};
        for (int n : testCases) {
            List<String> binaryNumbers = generateBinaryNumbers(n);
            System.out.println("First " + n + " binary numbers: " + binaryNumbers);
        }
    }
}