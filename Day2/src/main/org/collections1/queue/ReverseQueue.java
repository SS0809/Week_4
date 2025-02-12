package org.collections1.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//Reverse a Queue
//Reverse the elements of a queue using only queue operations
// (e.g., add, remove, isEmpty).
//Example:
//Input: [10, 20, 30] → Output: [30, 20, 10].
public class ReverseQueue {
    static Queue<Integer> q = new LinkedList<>();
    static Queue<Integer> reverseQueue(Queue<Integer>q){
        if(q.isEmpty())
            return null;
        int last = q.remove();
        reverseQueue(q);
        q.add(last);
        return q;
    }
    public static void main(String[] args) {
        q.addAll(Arrays.asList(10,20,30));
        System.out.println(q);
        reverseQueue(q);
        System.out.println(q);
    }
}
