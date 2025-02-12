package org.collections1.set;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricDifferenceTest {
    @Test
    void test(){
        Set<Integer> st1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> st2 = new HashSet<>(Arrays.asList(3,4,5));
        SymmetricDifference sd = new SymmetricDifference();
        Set<Integer> expected = new HashSet<>(Arrays.asList(1,2,4,5));
        assertEquals(expected,sd.getSymmetric(st1,st2));
    }
}