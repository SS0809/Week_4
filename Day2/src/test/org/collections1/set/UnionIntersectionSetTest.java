package org.collections1.set;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UnionIntersectionSetTest {
    @Test
    void test(){
        Set<Integer> st1 = new HashSet<>();
        st1.add(1);
        st1.add(2);
        st1.add(3);
        Set<Integer> st2 = new HashSet<>();
        st2.add(3);
        st2.add(4);
        st2.add(5);
        UnionIntersectionSet ut = new UnionIntersectionSet();


        Set<Integer> expectedUnion = new HashSet<>();
        Set<Integer> expectedIntersection = new HashSet<>();
        for (int i=1;i<6;i++)expectedUnion.add(i);
        expectedIntersection.add(3);

        assertEquals(expectedIntersection,ut.intersection(st1,st2));
        assertEquals(expectedUnion,ut.union(st1,st2));
    }
}