package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ShortestUnSortTest {
    ShortestUnSort s = new ShortestUnSort();
    @Test
    public void test1(){
        int[] arr = new int[]{2, 6, 4, 8, 10, 9, 15};
        assertEquals(5, s.findUnsortedSubarray(arr));
        arr = new int[]{1,2,3,4};
        assertEquals(0, s.findUnsortedSubarray(arr));
        arr = new int[]{2,1};
        assertEquals(2, s.findUnsortedSubarray(arr));
    }
}
