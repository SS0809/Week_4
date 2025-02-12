package org.collections1.queue;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import static org.collections1.queue.ReverseQueue.reverseQueue;
import static org.junit.jupiter.api.Assertions.*;

class ReverseQueueTest {
    @Test
    void test(){
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> expected = new LinkedList<>();
        ReverseQueue sb = new ReverseQueue();
        q.addAll(Arrays.asList(10,20,30));
        expected.addAll(Arrays.asList(30,20,10));
        assertEquals(expected,reverseQueue(q));
    }
}