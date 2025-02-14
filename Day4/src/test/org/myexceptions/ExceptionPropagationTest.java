package org.myexceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionPropagationTest {
    @Test
    void test() {
        ExceptionPropagation mc = new ExceptionPropagation();
        int[] arr = {5,0,3,6,7,9,0,4};
        assertThrows(IllegalArgumentException.class, () -> mc.calculateInterest(-100,5,3));
//    test will pass because exception is thrown and caught by assertThrows
    }
}