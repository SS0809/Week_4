package org.collections1.queue;

import java.io.FilterOutputStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Implement a Stack Using Queues
//Implement a stack data structure using two queues and support push, pop, and top operations.
//        Example:
//Push 1, 2, 3 → Pop → Output: 3.
public class StackUsingQueue {
    Queue<Integer> q = new LinkedList<>();
    void push(int ele){
        q.add(ele);
        //rotate till n-1 times to make queue data as stack
        int size = q.size()-1;
        while (size--!=0){
            q.add(q.remove());//remove and add to queue
        }
    }
    int pop(){
        return q.remove();
    }
    int peek(){
        return q.peek();
    }
    public static void main(String[] args) {
//        stack is LIFO
//        queue is FIFO
        StackUsingQueue sq = new StackUsingQueue();
        sq.push(1);
        sq.push(6);
        sq.push(9);
        sq.pop();
        System.out.print("StackusingQueue is : ");
        for (int temp : sq.q)
            System.out.print(temp+", ");
        System.out.println("\nPeek element is : "+sq.peek());
    }
}
