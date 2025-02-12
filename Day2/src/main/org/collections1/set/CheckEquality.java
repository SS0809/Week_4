package org.collections1.set;

import java.util.HashSet;
import java.util.Set;

//Check if Two Sets Are Equal
//Compare two sets and determine
// if they contain the same elements, regardless of order.
//        Example:
//Set1: {1, 2, 3}, Set2: {3, 2, 1} → Output: true.
public class CheckEquality {
    boolean checkSet(Set<Integer> st1 ,Set<Integer> st2 ){
        if(st1.equals(st2))
            return true;
        return false;
    }
    public static void main(String[] args) {
        Set<Integer> st1 = new HashSet<>();
        st1.add(1);
        st1.add(2);
        st1.add(3);
        Set<Integer> st2 = new HashSet<>();
        st2.add(3);
        st2.add(2);
        st2.add(1);
        CheckEquality ce = new CheckEquality();
        if(ce.checkSet(st1,st2))
            System.out.println("equal");
        else
            System.out.println("not equal");
    }
}
