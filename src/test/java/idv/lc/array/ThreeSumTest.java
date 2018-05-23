package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ThreeSumTest {
    ThreeSum s = new ThreeSum();
    @Test
    public void test1(){
        int[] arr = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = s.threeSum(arr);
        assertEquals(2, res.size());
    }
    @Test
    public void test2(){
        int[] arr = new int[]{0,0,0};
        List<List<Integer>> res = s.threeSum(arr);
        assertEquals(1, res.size());
    }
}
