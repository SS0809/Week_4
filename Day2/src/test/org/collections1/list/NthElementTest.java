package org.collections1.list;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NthElementTest {
    @Test
    void test(){
        NthElement ne = new NthElement();
        ne.nele(2);
        assertEquals('D',ne.ans);
    }
}