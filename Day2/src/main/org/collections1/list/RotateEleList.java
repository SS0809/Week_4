package org.collections1.list;

import java.util.LinkedList;
import java.util.List;

//Rotate Elements in a List
//Rotate the elements of a list by a given number of positions.
//Example:
//Input: [10, 20, 30, 40, 50], rotate by 2 → Output: [30, 40, 50, 10, 20].
public class RotateEleList {
    public List list = new LinkedList();
    void rotateList(int rotate){
        int n =5;
        for (int i=1;i<=n;i++){
            list.add(i*10);
        }
        for (int i=0;i<=rotate;i++){
            list.add(0,list.remove(n-1));
        }
    }
    public static void main(String[] args) {
        int rotate = 2;
        RotateEleList rt = new RotateEleList();
        rt.rotateList(rotate);
        System.out.println(rt.list);
    }
}
