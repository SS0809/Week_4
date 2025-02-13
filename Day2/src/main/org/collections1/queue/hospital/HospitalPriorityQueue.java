package org.collections1.queue.hospital;

import java.util.Comparator;
import java.util.PriorityQueue;

//Hospital Triage System
//Simulate a hospital triage system using a PriorityQueue where patients with higher severity are treated first.
//Example:
//Patients: [("John", 3), ("Alice", 5), ("Bob", 2)] → Order: Alice, John, Bob.

public class HospitalPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Pair<String,Integer>> q = new PriorityQueue<>(new MyFirstCustomComparator());
        Pair<String,Integer>p1 =new Pair<>("John",3);
        Pair<String,Integer>p2 =new Pair<>("Alice",5);
        Pair<String,Integer>p3 =new Pair<>("Bob",2);
        q.add(p1);
        q.add(p2);
        q.add(p3);
        for (Pair<String,Integer> temp : q) {
            System.out.print(temp.a+", ");
        }
    }
}
