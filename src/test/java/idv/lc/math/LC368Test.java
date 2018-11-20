package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC368Test {
    LC368 s = new LC368();
    @Test
    public void test1(){
        List<Integer> res = s.largestDivisibleSubset(new int[]{1,2,3});
        assertEquals("[2, 1]", Arrays.toString(res.toArray()));
    }
    @Test
    public void test2(){
        List<Integer> res = s.largestDivisibleSubset(new int[]{1,2,4,8});
        assertEquals("[8, 4, 2, 1]", Arrays.toString(res.toArray()));
    }
}
