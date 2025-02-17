package org.annotations.customannotation.advancedlevel.customcachingsystem;
public class Computation {

    @CacheResult
    public int computeExpensiveOperation(int number) {
        try {
            Thread.sleep(2000); // Simulate a time-consuming operation
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return number * number; // Return square as a computationally expensive example
    }
}
