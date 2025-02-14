package org.myexceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultipleCatchBlocksTest {
    @Test
    void test() {
        MultipleCatchBlocks mc = new MultipleCatchBlocks();
        int[] arr = {5,0,3,6,7,9,0,4};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> mc.arrayOps(arr,arr.length+2));
//    test will pass because exception is thrown and caught by assertThrows
    }
    @Test
    void test1() {
        MultipleCatchBlocks mc = new MultipleCatchBlocks();
        int[] arrr = null;
        assertThrows(NullPointerException.class, () -> mc.arrayOps(arrr,1));
//    test will pass because exception is thrown and caught by assertThrows
    }

}