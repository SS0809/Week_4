package org.collections1.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

public class WordFreqTest {
    private File testFile;

    @BeforeEach
    void setUp() throws IOException {
        testFile = new File("test_input.txt");
        FileWriter writer = new FileWriter(testFile);
        writer.write("Hello world, hello Java!");
        writer.close();
    }

    @Test
    void testWordFrequency() throws IOException {
        TreeMap<String, Integer> expectedOutput = new TreeMap<>();
        expectedOutput.put("hello", 2);
        expectedOutput.put("world", 1);
        expectedOutput.put("java", 1);

        TreeMap<String, Integer> actualOutput = WordFreq.processFile(testFile);

        assertEquals(expectedOutput, actualOutput);
    }
}
