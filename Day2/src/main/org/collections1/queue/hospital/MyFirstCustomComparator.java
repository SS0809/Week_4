package org.collections1.queue.hospital;

import java.util.Comparator;

public class MyFirstCustomComparator implements Comparator<Pair<String,Integer>> {
    public int compare(Pair o1, Pair o2) {
        Integer b1 = (Integer) o1.b;
        Integer b2 = (Integer) o2.b;

        return b2.compareTo(b1);//first operand should be small
    }
}