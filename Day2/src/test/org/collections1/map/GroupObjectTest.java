package org.collections1.map;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.*;

public class GroupObjectTest {
    @Test
    void testGroup() {
        GroupObject groupObject = new GroupObject();
        HashMap<String, String> employees = new HashMap<>();
        employees.put("Shreya", "HR");
        employees.put("Uday", "IT");
        employees.put("Pankaj", "IT");
        employees.put("Saurabh", "HR");

        HashMap<String, ArrayList<String>> expected = new HashMap<>();
        expected.put("HR", new ArrayList<>(Arrays.asList("Shreya", "Saurabh")));
        expected.put("IT", new ArrayList<>(Arrays.asList("Pankaj", "Uday")));

        assertEquals(expected, groupObject.group(employees));
    }
}
