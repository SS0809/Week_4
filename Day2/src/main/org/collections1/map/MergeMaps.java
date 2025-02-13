package org.collections1.map;

import java.util.HashMap;

//Merge Two Maps
//Merge two maps such that if a key exists in both, sum their values.
//        Example:
//Map1: {A=1, B=2}, Map2: {B=3, C=4} → Output: {A=1, B=5, C=4}.
public class MergeMaps {
    HashMap<Character,Integer> merge(HashMap<Character,Integer> hm1,HashMap<Character,Integer> hm2){
        HashMap<Character,Integer> merged = new HashMap<>();
        for (char temp : hm1.keySet()){
            merged.put(temp,hm1.get(temp));
        }
        for (char key : hm2.keySet()){
            merged.put(key, merged.getOrDefault(key, 0) + hm2.get(key));
        }
        return merged;
    }
    public static void main(String[] args) {
        HashMap<Character,Integer> hm1 = new HashMap<>();
        hm1.put('A',1);
        hm1.put('B',2);
        HashMap<Character,Integer> hm2 = new HashMap<>();
        hm2.put('C',4);
        hm2.put('B',3);
        MergeMaps m = new MergeMaps();
        System.out.println(m.merge(hm1,hm2));
    }
}
