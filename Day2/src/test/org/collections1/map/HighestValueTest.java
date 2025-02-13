package org.collections1.map;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class HighestValueTest {

    @Test
    public void testMaxValue() {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('A', 10);
        hm.put('B', 20);
        hm.put('C', 15);

        HighestValue hv = new HighestValue();
        int result = hv.maxValue(hm);

        // The expected maximum value is 20
        assertEquals(20, result);
    }
}