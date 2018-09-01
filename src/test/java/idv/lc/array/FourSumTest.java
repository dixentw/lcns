package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class FourSumTest {
    FourSum s = new FourSum();
    @Test
    public void test1(){
        List<List<Integer>> res = s.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        assertEquals("[-2, -1, 1, 2]", Arrays.toString(res.get(0).toArray()));
        assertEquals("[-2, 0, 0, 2]", Arrays.toString(res.get(1).toArray()));
        assertEquals("[-1, 0, 0, 1]", Arrays.toString(res.get(2).toArray()));
    }
    @Test
    public void test2(){
        List<List<Integer>> res = s.fourSum(new int[]{-3,-2,-1,0,0,1,2,3}, 0);
        assertEquals(8, res.size());
        assertEquals("[-3, -2, 2, 3]", Arrays.toString(res.get(0).toArray()));
        assertEquals("[-3, -1, 1, 3]", Arrays.toString(res.get(1).toArray()));
        assertEquals("[-3, 0, 0, 3]", Arrays.toString(res.get(2).toArray()));
    }
}
