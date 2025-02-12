import org.collections1.list.ReverseList;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import static org.collections1.list.ReverseList.*;

public class ReverseListTest {
    @Test
    void test1(){
        ReverseList list = new ReverseList();
        list.implyArrayList();
        assertEquals(true,list.test1);
    }
    @Test
    void test2(){
        ReverseList list = new ReverseList();
        list.implyLinkedList();
        assertEquals(true,list.test2);
    }
}
