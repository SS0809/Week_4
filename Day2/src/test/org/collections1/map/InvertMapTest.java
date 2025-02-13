package org.collections1.map;

import org.junit.jupiter.api.Test;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class InvertMapTest {

    @Test
    void testInvertMap() {
        // Arrange
        InvertMap invertMap = new InvertMap();
        Map<Character, Integer> inputMap = new HashMap<>();
        inputMap.put('A', 1);
        inputMap.put('B', 2);
        inputMap.put('C', 1);

        // Expected output
        Map<Object, ArrayList<Character>> expectedOutput = new HashMap<>();
        expectedOutput.put("1", new ArrayList<>() {{
            add('A');
            add('C');
        }});
        expectedOutput.put("2", new ArrayList<>() {{
            add('B');
        }});

        // Act
        Map<Object, ArrayList<Character>> result = invertMap.invertMap(inputMap);

        // Assert
        assertEquals(expectedOutput, result);
    }

}