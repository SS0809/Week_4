package org.collections1.list;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RotateEleListTest {
    @Test
    void test(){
        RotateEleList lt = new RotateEleList();
        List list = new LinkedList();
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(10);
        list.add(20);
        lt.rotateList(2);
        assertEquals(list,lt.list);
    }
}