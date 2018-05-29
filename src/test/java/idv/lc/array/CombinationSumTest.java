package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class CombinationSumTest {
    CombinationSum s = new CombinationSum();
    @Test
    public void test1(){
        List<List<Integer>> res = s.combinationSum(new int[]{2,3,6,7}, 7);
        assertEquals("[2, 2, 3]", Arrays.toString(res.get(0).toArray()));
        assertEquals("[7]", Arrays.toString(res.get(1).toArray()));
    }
}
