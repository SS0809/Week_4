package org.collections1.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Symmetric Difference
//Find the symmetric difference
// (elements present in either set but not in both) of two sets.
//Example:
//Set1: {1, 2, 3}, Set2: {3, 4, 5} → Output: {1, 2, 4, 5}.
public class SymmetricDifference {
    Set<Integer> intersection = new HashSet<>();
    Set<Integer> symmetric = new HashSet<>();
    Set<Integer> union = new HashSet<>();
    Set<Integer> getSymmetric(Set<Integer> st1, Set<Integer> st2){
        union.addAll(st1);
        union.addAll(st2);
        for (int temp : st1){
            if (st2.contains(temp)){
                intersection.add(temp);
            }
        }
        for(int temp: union){
            if(!intersection.contains(temp)){
                symmetric.add(temp);
            }
        }
        return symmetric;
    }

    public static void main(String[] args) {
        Set<Integer> st1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> st2 = new HashSet<>(Arrays.asList(3,4,5));
        SymmetricDifference sd = new SymmetricDifference();
        System.out.println(sd.getSymmetric(st1,st2));

    }
}
