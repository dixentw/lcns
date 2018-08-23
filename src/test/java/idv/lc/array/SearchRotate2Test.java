package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class SearchRotate2Test {
    SearchRotate2 s = new SearchRotate2();
    @Test
    public void test1(){
        assertTrue(s.search(new int[]{2,5,6,0,0,1,2}, 0));
        assertFalse(s.search(new int[]{2,5,6,0,0,1,2}, 3));
        assertTrue(s.search(new int[]{1,3,5}, 1));
        assertTrue(s.search(new int[]{1,3,5}, 3));
        assertTrue(s.search(new int[]{1,3,5}, 5));
        assertTrue(s.search(new int[]{1,3}, 3));
        assertTrue(s.search(new int[]{3,1,1}, 3));
        assertTrue(s.search(new int[]{1,3,1,1,1}, 3));
    }
}
