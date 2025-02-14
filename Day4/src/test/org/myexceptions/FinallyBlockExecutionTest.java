package org.myexceptions;

import org.myexceptions.FinallyBlockExecution;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class FinallyBlockExecutionTest {
    @Test
    void test() {
        FinallyBlockExecution uck = new FinallyBlockExecution();
        assertThrows(ArithmeticException.class, () -> uck.divideNum(4, 0));
//    test will pass because exception is thrown and caught by assertThrows
    }
}