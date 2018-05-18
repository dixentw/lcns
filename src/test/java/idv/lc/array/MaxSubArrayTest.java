package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MaxSubArrayTest {
    MaxSubArray s = new MaxSubArray();
    @Test
    public void test1(){
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6, s.maxSubArray(arr));
        arr = new int[]{-1};
        assertEquals(-1, s.maxSubArray(arr));
    }
}
