package org.collections1.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//Find the Nth Element from the End
//Given a singly linked list (use LinkedList),
// find the Nth element from the end without calculating its size.
//Example:
//Input: [A, B, C, D, E], N=2 → Output: D.
public class NthElement {
    public char ans ;
    public List<Character> list = new LinkedList<>();
    void nele(int ele){
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        int i=0;
        ListIterator<Character> fir = list.listIterator() ;
        ListIterator<Character> sec = list.listIterator() ;
        while(i<ele && fir.hasNext()){
            fir.next();
            i++;
        }
        if(i<ele) {
            //only for ele < (size)
            System.out.println("code fata :)");
            System.exit(0);
        }
        while (fir.hasNext()){
            fir.next();
            sec.next();
        }
        ans = sec.next();
    }
    public static void main(String[] args) {
        NthElement n = new NthElement();
        n.nele(14);
        System.out.println(n.ans);
    }
}
