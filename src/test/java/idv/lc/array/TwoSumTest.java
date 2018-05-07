package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class TwoSumTest {
    TwoSum s = new TwoSum();
    @Test
    public void test1(){
        int[] arr = new int[]{2, 7, 11, 15};
        int[] res = s.twoSum(arr, 9);
        assertEquals(0, res[0]);
        assertEquals(1, res[1]);
        arr = new int[]{3, 2, 4};
        res = s.twoSum(arr, 6);
        assertEquals(1, res[0]);
        assertEquals(2, res[1]);
        arr = new int[]{3, 3};
        res = s.twoSum(arr, 6);
        assertEquals(0, res[0]);
        assertEquals(1, res[1]);
    }
}
