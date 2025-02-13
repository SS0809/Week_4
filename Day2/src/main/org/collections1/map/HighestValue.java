package org.collections1.map;

import java.util.HashMap;

//Find the Key with the Highest Value
//Given a Map<String, Integer>, find the key with the maximum value.
//        Example:
//Input: {A=10, B=20, C=15} → Output: B.
public class HighestValue {
    int maxValue(HashMap<Character,Integer> hm){
        int max = Integer.MIN_VALUE;
        for (Character temp: hm.keySet()){
            max = Math.max(hm.get(temp),max);
        }
        return max;
    }
    public static void main(String[] args) {
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('A',10);
        hm.put('B',20);
        hm.put('C',15);
        HighestValue hv = new HighestValue();
        System.out.println(hv.maxValue(hm));
    }
}
