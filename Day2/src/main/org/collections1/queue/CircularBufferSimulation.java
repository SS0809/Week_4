package org.collections1.queue;

import java.util.LinkedList;
import java.util.Queue;

//Circular Buffer Simulation
//Implement a circular buffer (fixed-size queue) using an array-based queue.
// When full, overwrite the oldest element.
//        Example:
//Buffer size=3: Insert 1, 2, 3 → Insert 4 → Buffer: [2, 3, 4].
public class CircularBufferSimulation {
    Queue<Integer> q = new LinkedList<>();
    int size ;
    void add(int ele){
        size++;
        q.add(ele);
        if(size<=q.size())
            q.remove();
    }
    void print(){
        while (!q.isEmpty())
            System.out.print(q.remove()+", ");
    }
    public static void main(String[] args) {
        CircularBufferSimulation cb = new CircularBufferSimulation();
        cb.add(9);
        cb.add(4);
        cb.add(3);
//        cb.print();
        cb.add(2);
        cb.print();
    }
}
