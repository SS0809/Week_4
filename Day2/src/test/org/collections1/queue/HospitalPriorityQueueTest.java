package org.collections1.queue;

import org.collections1.queue.hospital.*;
import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

class HospitalPriorityQueueTest {
    @Test
    void test(){
        PriorityQueue<Pair<String,Integer>> q = new PriorityQueue<>(new MyFirstCustomComparator());
        Pair<String,Integer>p1 =new Pair<>("John",3);
        Pair<String,Integer>p2 =new Pair<>("Alice",5);
        Pair<String,Integer>p3 =new Pair<>("Bob",2);
        q.add(p1);
        q.add(p2);
        q.add(p3);
        for (Pair<String,Integer> temp : q) {
            System.out.print(temp.a+", ");
        }
    }
}