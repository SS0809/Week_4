package org.collections1.set;

import org.collections1.set.CheckEquality;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CheckEqualityTest {
    @Test
    void test(){
        Set<Integer> st1 = new HashSet<>();
        st1.add(1);
        st1.add(2);
        st1.add(3);
        Set<Integer> st2 = new HashSet<>();
        st2.add(3);
        st2.add(2);
        st2.add(1);
        CheckEquality ne = new CheckEquality();
        assertEquals(true,ne.checkSet(st1,st2));
    }
}