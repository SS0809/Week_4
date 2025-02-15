package org.regex.replacemodify;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Replace Multiple Spaces with a Single Space
//🔹 Example Input:
//        "This is an example with multiple spaces."
//        🔹 Expected Output:
//        "This is an example with multiple spaces."
public class MultipleToSingleSpace {
    String replace(String input){
        String regex = "\\s+",res = "";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(input);
        while (m.find()){
            res = input.replaceAll(m.group()," ");
        }
        return res;
    }
    public static void main(String[] args) {
        String input = "This  is  an example  with multiple  spaces.";
        MultipleToSingleSpace ms = new MultipleToSingleSpace();
        System.out.println(ms.replace(input));
    }
}
