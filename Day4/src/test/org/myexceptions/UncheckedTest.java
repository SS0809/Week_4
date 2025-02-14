package org.myexceptions;

import org.myexceptions.Unchecked;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class UncheckedTest {
    @Test
    void test() {
        Unchecked uck = new Unchecked();
        assertThrows(ArithmeticException.class, () -> uck.divideNum(4, 0));
//    test will pass because exception is thrown and caught by assertThrows
    }
}