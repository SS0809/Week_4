package org.collections1.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Reverse a List
//Write a program to reverse the elements of a given List without using built-in reverse methods. Implement it for both ArrayList and LinkedList.
//Example:
//Input: [1, 2, 3, 4, 5] → Output: [5, 4, 3, 2, 1].
public class ReverseList {
    public boolean test1 , test2;
    public void implyArrayList(){
        //       Implemented using ArrayList .
        List<Integer> list = new ArrayList<>();
        int n=5;
        for (int i=1;i<=n;i++){
            list.add(i);
        }
        for (int i=0;i<n;i++){
            System.out.print(list.get(i)+",");
        }
        System.out.println();
        int temp = 0;
        for (int i=0;i<=n/2;i++){
            temp = list.get(i);
            list.set(i,list.get(n-i-1));
            list.set(n-i-1,temp);
        }
        for (int i=0;i<n;i++){
            System.out.print(list.get(i)+",");
        }
        System.out.println();
        test1=true;
    }
    public void implyLinkedList(){
        //       Implemented using LinkedList .
        List<Integer> list = new LinkedList<>();
        int n=5;
        for (int i=1;i<=n;i++){
            list.add(i);
        }
        for (int i=0;i<n;i++){
            System.out.print(list.get(i)+",");
        }
        System.out.println();
        for (int i=0;i<n;i++){
            list.add(i,list.get(n-1));
        }
        for (int i=0;i<n;i++){
            System.out.print(list.get(i)+",");
        }
        System.out.println();
        test2=true;
    }
    public static void main(String[] args) {
        ReverseList list = new ReverseList();
        list.implyArrayList();
        list.implyLinkedList();
    }
}
