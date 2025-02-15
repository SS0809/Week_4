package org.regex.replacemodify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultipleToSingleSpaceTest {
    @Test
    void test(){
        String input = "This       is  an example  with multiple  spaces.";
        MultipleToSingleSpace ms = new MultipleToSingleSpace();
        String expected = "This is an example with multiple spaces.";
        assertEquals(expected,ms.replace(input));
    }
}