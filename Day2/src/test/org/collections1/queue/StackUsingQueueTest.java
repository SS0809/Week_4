package org.collections1.queue;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class StackUsingQueueTest {
    @Test
    void test(){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(6);
        st.push(9);
        StackUsingQueue sq = new StackUsingQueue();
        sq.push(1);
        sq.push(6);
        sq.push(9);
        for (int i =0;i<st.size();i++){
            assertEquals(st.pop(),sq.pop());
        }
        System.out.println("Queue is using LIFO rules");
    }
}