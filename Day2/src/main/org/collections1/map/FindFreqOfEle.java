package org.collections1.map;

import java.util.HashMap;
import java.util.Map;

//Find Frequency of Elements
//Given a list of strings, count the frequency of each element and
// return the results in a Map<String, Integer>.
//        Example:
//Input: ["apple", "banana", "apple", "orange"] →
// Output: {apple=2, banana=1, orange=1}.
public class FindFreqOfEle {
    public Map<String,Integer> mp = new HashMap<>();
    public void implyMap(){
        String arr[] = {"apple", "banana", "apple", "orange"};
        for (int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        for (String temp : mp.keySet()){
            System.out.println(temp);
        }
    }
    public static void main(String[] args) {
        FindFreqOfEle freq = new FindFreqOfEle();
        freq.implyMap();
    }
}
