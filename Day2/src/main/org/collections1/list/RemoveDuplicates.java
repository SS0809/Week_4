package org.collections1.list;

import java.util.LinkedList;
import java.util.List;

//Remove Duplicates While Preserving Order
//Remove duplicate elements from a list
// while maintaining the original order of elements.
//Example:
//Input: [3, 1, 2, 2, 3, 4] → Output: [3, 1, 2, 4].
public class RemoveDuplicates {
    public List<Integer> list =new LinkedList<>();
    public List<Integer> list1 =new LinkedList<>();
    void removedupli(){
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);

        for (int i=0;i<list.size();i++){
            if(!list1.contains(list.get(i)))
                list1.add(list.get(i));
        }
        System.out.println(list1);
    }
    public static void main(String[] args) {
        RemoveDuplicates rd = new RemoveDuplicates();
        rd.removedupli();
    }
}
