package org.collections1.map;

import java.io.*;
import java.util.HashMap;
import java.util.TreeMap;

//Word Frequency Counter
//Read a text file and count the frequency of each word using a HashMap.
// Ignore case and punctuation.
//Example:
//Input: "Hello world, hello Java!" → Output: {hello=2, world=1, java=1}
public class WordFreq {
    static TreeMap<String,Integer> processFile(File fl){
        TreeMap<String,Integer> hm = new TreeMap<>();
        try {
            Reader rd = new FileReader(fl);
            int character;
            StringBuffer sb = new StringBuffer();
            while ((character = rd.read()) != -1) {
                if(character != ' '){
                    if((character>64 && character<91) || (character>96 && character<123)){//only chars
                        if (character<91){
                            character+=32;//get only small if large make it smalll
                        }
                        sb.append((char) character);
                        //                    System.out.print((char) character);
                    }
                }else {
//                    System.out.println(sb);
                    hm.put(sb.toString(), hm.getOrDefault(sb.toString(),0)+1);
                    sb.delete(0,sb.length());
                }
            }
            hm.put(sb.toString(), hm.getOrDefault(sb.toString(),0)+1);
            for(String temp : hm.keySet()){
                System.out.println(temp+" : "+hm.get(temp));
            }
            return hm;
        }catch (Exception e){
            System.out.println("error");
        }
        return null;
    }
    public static void main(String[] args) throws IOException {
        File testFile = new File("input.txt");
        WordFreq.processFile(testFile);
    }
}
