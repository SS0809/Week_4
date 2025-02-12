package org.collections1.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//Convert a Set to a Sorted List
//Convert a HashSet of integers into a sorted list in ascending order.
//Example:
//Input: {5, 3, 9, 1} → Output: [1, 3, 5, 9].
public class SetToSortedList {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(Arrays.asList(5,3,-9,1));
        System.out.println(set.stream().toList());
    }
}
