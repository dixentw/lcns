package idv.lc.bt;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC47Test {
    LC47 s = new LC47();
    @Test
    public void test1(){
        List<List<Integer>> res = s.permuteUnique(new int[]{1,1,2});
        assertEquals(3, res.size());
        assertEquals("[1, 1, 2]", Arrays.toString(res.get(0).toArray()));
        assertEquals("[1, 2, 1]", Arrays.toString(res.get(1).toArray()));
        assertEquals("[2, 1, 1]", Arrays.toString(res.get(2).toArray()));
    }
}
