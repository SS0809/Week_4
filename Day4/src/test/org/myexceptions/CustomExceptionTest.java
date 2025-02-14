package org.myexceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomExceptionTest {
    @Test
    void test() {
        CustomException ce = new CustomException();
        assertThrows(InvalidAgeException.class, () -> ce.validateAge(15));
//    test will pass because exception is thrown and caught by assertThrows
    }
}