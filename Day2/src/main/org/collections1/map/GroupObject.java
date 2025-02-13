package org.collections1.map;

import java.util.ArrayList;
import java.util.HashMap;

//Group Objects by Property
//Given a list of Employee objects, group them by their department using a Map<Department, List<Employee>>.
//        Example:
//Employees: [Alice (HR), Bob (IT), Carol (HR)] → Output: HR: [Alice, Carol], IT: [Bob].
public class GroupObject {
    HashMap<String,ArrayList<String>> group(HashMap<String,String>hm){
        HashMap<String,ArrayList<String>> inverted= new HashMap<>();
        for (String temp : hm.keySet()){
            String key = hm.get(temp);
            inverted.putIfAbsent(key,new ArrayList<>());
            inverted.get(key).add(temp);
        }
        return inverted;
    }
    public static void main(String[] args) {
        HashMap<String,String> h1 = new HashMap<>();
        h1.put("Shreya","HR");
        h1.put("Uday","IT");
        h1.put("Pankaj","IT");
        h1.put("Saurabh","HR");
        GroupObject go = new GroupObject();
        System.out.println(go.group(h1));
    }
}
