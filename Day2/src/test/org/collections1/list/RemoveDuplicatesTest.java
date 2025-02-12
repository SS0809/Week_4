package org.collections1.list;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {
    @Test
    void test(){
        RemoveDuplicates rd = new RemoveDuplicates();
        rd.removedupli();
        List<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(4);
        assertEquals(list,rd.list1);
    }
}