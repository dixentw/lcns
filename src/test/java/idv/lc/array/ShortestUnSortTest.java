package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ShortestUnSortTest {
    ShortestUnSort s = new ShortestUnSort();
    @Test
    public void test1(){
        assertEquals(0, s.findUnsortedSubarray(new int[]{1,2,3,4}));
        assertEquals(5, s.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
        assertEquals(2, s.findUnsortedSubarray(new int[]{2,1}));
        assertEquals(2, s.findUnsortedSubarray(new int[]{1,3,2,4,5}));
        assertEquals(3, s.findUnsortedSubarray(new int[]{1,2,4,5,3}));
        assertEquals(3, s.findUnsortedSubarray(new int[]{2,3,3,2,3}));
    }
}
