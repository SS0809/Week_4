package org.myexceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NestedTryCatchTest {
    @Test
    void test() {
        NestedTryCatch mc = new NestedTryCatch();
        int[] arr = {5,0,3,6,7,9,0,4};
        int div =0;
        int size = arr.length;
        assertThrows(ArithmeticException.class, () -> mc.divisionOperation(arr,div,size));
//    test will pass because exception is thrown and caught by assertThrows
    }
    @Test
    void test2() {
        NestedTryCatch mc = new NestedTryCatch();
        int[] arr = {5,0,3,6,7,9,0,4};
        int div =1;
        int size = arr.length+1;
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> mc.divisionOperation(arr,div,size));
//    test will pass because exception is thrown and caught by assertThrows
    }
}