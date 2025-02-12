package org.collections1.queue;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.collections1.queue.GeneratoQueue.generateBinaryNumbers;
import static org.junit.jupiter.api.Assertions.*;

class GeneratoQueueTest {
    @Test
    void test(){
        int[] testCases = {5, 3, 1, 0};
        for (int n : testCases) {
            List<String> binaryNumbers = generateBinaryNumbers(n);
            System.out.println("First " + n + " binary numbers: " + binaryNumbers);
        }
    }
}