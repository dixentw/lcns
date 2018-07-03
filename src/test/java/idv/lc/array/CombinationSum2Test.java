package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class CombinationSum2Test {
    CombinationSum2 s = new CombinationSum2();
    @Test
    public void test1(){
        List<List<Integer>> res = s.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);
        assertEquals(4, res.size());
        assertEquals("[1, 1, 6]", Arrays.toString(res.get(0).toArray()));
        assertEquals("[1, 2, 5]", Arrays.toString(res.get(1).toArray()));
        assertEquals("[1, 7]", Arrays.toString(res.get(2).toArray()));
        assertEquals("[2, 6]", Arrays.toString(res.get(3).toArray()));
    }
}
