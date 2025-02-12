import org.collections1.map.FindFreqOfEle;
import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

import static org.collections1.list.ReverseList.*;

public class FindFreqOfEleTest {
    @Test
    void test1() {
        FindFreqOfEle freq = new FindFreqOfEle();
        freq.implyMap();
        HashMap<String,Integer> test = new HashMap<>();
        test.put("apple", 2);
        test.put("banana", 1);
        test.put("orange", 1);
        assertEquals(test, freq.mp);
    }
}
