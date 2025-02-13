package org.collections1.map;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.*;

public class MergeMapsTest {
    @Test
    void testMerge() {
        MergeMaps mergeMaps = new MergeMaps();
        HashMap<Character, Integer> hm1 = new HashMap<>();
        hm1.put('A', 1);
        hm1.put('B', 2);

        HashMap<Character, Integer> hm2 = new HashMap<>();
        hm2.put('C', 4);
        hm2.put('B', 3);

        HashMap<Character, Integer> expected = new HashMap<>();
        expected.put('A', 1);
        expected.put('B', 5);
        expected.put('C', 4);

        assertEquals(expected, mergeMaps.merge(hm1, hm2));
    }
}