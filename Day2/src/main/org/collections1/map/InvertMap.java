package org.collections1.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Invert a Map
//Invert a Map<K, V> to produce a Map<V, K>.
//Handle duplicate values by storing them in a list.
//        Example:
//Input: {A=1, B=2, C=1} → Output: {1=[A, C], 2=[B]}.
public class InvertMap {
    Map invertMap(Map<Character,Integer> hm){
        HashMap<Object, ArrayList<Character>> inverted= new HashMap<>();
        for (char temp : hm.keySet()){
//            hm.get(temp)//key
//            temp//value
            String key = String.valueOf(hm.get(temp));
            inverted.putIfAbsent(key, new ArrayList<>());
            inverted.get(key).add(temp);
        }
        return inverted;
    }
    public static void main(String[] args) {
        Map<Character,Integer> hm = new HashMap<>();
        hm.put('A',hm.getOrDefault('A',0)+1);
        hm.put('B',hm.getOrDefault('B',0)+1);
        hm.put('B',hm.getOrDefault('B',0)+1);
        hm.put('C',hm.getOrDefault('C',0)+1);
        InvertMap im = new InvertMap();
        System.out.println(im.invertMap(hm));
    }
}
