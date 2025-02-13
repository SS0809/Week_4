package org.collections1.queue;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class CircularBufferSimulationTest {
    @Test
    void test(){
        CircularBufferSimulation cb = new CircularBufferSimulation();
        cb.add(9);
        cb.add(4);
        cb.add(3);
        cb.add(2);
        Queue<Integer> expected = new LinkedList<>();
        expected.add(4);
        expected.add(3);
        expected.add(2);
        assertEquals(cb.q,expected);
        cb.print();
    }
}