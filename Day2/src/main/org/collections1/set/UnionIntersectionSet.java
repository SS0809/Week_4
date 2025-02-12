package org.collections1.set;

import java.util.HashSet;
import java.util.Set;

//Union and Intersection of Two Sets
//Given two sets, compute their union and intersection.
//        Example:
//Set1: {1, 2, 3}, Set2: {3, 4, 5} → Union: {1, 2, 3, 4, 5},
// Intersection: {3}.
public class UnionIntersectionSet {
    Set<Integer> union = new HashSet<>();
    Set<Integer> intersection = new HashSet<>();
    Set<Integer> union(Set<Integer> st1,Set<Integer> st2){
        union.addAll(st1);
        union.addAll(st2);
        return union;
    }
    Set<Integer> intersection(Set<Integer> st1, Set<Integer> st2){
        for (int temp : st1){
          if (st2.contains(temp)){
              intersection.add(temp);
          }
        }
        return intersection;
    }
    public static void main(String[] args) {
        Set<Integer> st1 = new HashSet<>();
        st1.add(1);
        st1.add(2);
        st1.add(3);
        Set<Integer> st2 = new HashSet<>();
        st2.add(3);
        st2.add(4);
        st2.add(5);
        UnionIntersectionSet ut = new UnionIntersectionSet();
        System.out.println(ut.intersection(st1,st2));
        System.out.println(ut.union(st1,st2));
    }
}
