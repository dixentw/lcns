package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class SubArrSumKTest {
    SubArrSumK s = new SubArrSumK();
    @Test
    public void test1(){
        assertEquals(0, s.subarraySum(new int[]{1}, 0));
        assertEquals(0, s.subarraySum(new int[]{1, 1, 1}, 0));
        assertEquals(2, s.subarraySum(new int[]{1, 1, 1}, 2));
        assertEquals(1, s.subarraySum(new int[]{-1, -1, 1}, 0));
        assertEquals(7, s.subarraySum(new int[]{-3, 7, -7, 7, -7, 0, 7}, 7));
    }
}
