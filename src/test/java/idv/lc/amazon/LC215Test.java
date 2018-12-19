package idv.lc.amazon;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC215Test {
    LC215 s = new LC215();
    @Test
    public void test1(){
        int[] arr = new int[]{3,2,1,5,6,4};
        assertEquals(5, s.findKthLargest(arr, 2));
    }
    @Test
    public void test2(){
        int[] arr = new int[]{3,2,3,1,2,4,5,5,6};
        assertEquals(4, s.findKthLargest(arr, 4));
    }
    @Test
    public void test3(){
        int[] arr = new int[]{2, 1};
        assertEquals(1, s.findKthLargest(arr, 2));
    }
}
