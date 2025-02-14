package org.myexceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionPropogationMethodTest {
    @Test
    void test() {
        ExceptionPropogationMethod mc = new ExceptionPropogationMethod();
        int[] arr = {5,0,3,6,7,9,0,4};
        assertThrows(ArithmeticException.class, () -> mc.method2(100,0));
//    test will pass because exception is thrown and caught by assertThrows
    }
}