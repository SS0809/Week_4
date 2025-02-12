package org.collections1.set;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SubSetTest {
    @Test
    void test(){
        Set<Integer> s1=new HashSet<>(Arrays.asList(2,3));
        Set<Integer>s2=new HashSet<>(Arrays.asList(1,2,3,4));
        SubSet sb = new SubSet();
        assertEquals(true,sb.findSubSet(s1,s2));
    }
}