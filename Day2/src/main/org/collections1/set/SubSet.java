package org.collections1.set;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Find Subsets
//Check if one set is a subset of another.
//        Example:
//Set1: {2, 3}, Set2: {1, 2, 3, 4} → Output: true.
public class SubSet {
    boolean findSubSet(Set<Integer>s1,Set<Integer>s2){
        int ct=0;
        for (int temp : s2){
            if(s1.contains(temp))
                ct++;
        }
        if(ct==s1.size()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Set<Integer>s1=new HashSet<>(Arrays.asList(2,3));
        Set<Integer>s2=new HashSet<>(Arrays.asList(1,2,3,4));
        SubSet sb = new SubSet();
        if(sb.findSubSet(s1,s2)){
            System.out.println("s1 is a subset of s2");
        }else{
            System.out.println("s1 is not a subset of s2");
        }

    }
}
