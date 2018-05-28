package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class SearchRotateTest {
    SearchRotate s = new SearchRotate();
    @Test
    public void test1(){
        int[] arr = new int[]{4,5,6,7,0,1,2};
        assertEquals(4, s.search(arr, 0));
        assertEquals(-1, s.search(arr, 3));
        assertEquals(1, s.search(new int[]{1,3}, 3));
        assertEquals(4, s.search(new int[]{4,5,6,7,8,1,2,3}, 8));
        assertEquals(0, s.search(new int[]{3,5,1}, 3));
    }
}
