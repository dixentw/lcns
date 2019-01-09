package idv.lc.bt;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC46Test {
    LC46 s = new LC46();
    @Test
    public void test1(){
        List<List<Integer>> res = s.permute(new int[]{1,2,3});
        assertEquals(6, res.size());
        assertEquals("[1, 2, 3]", Arrays.toString(res.get(0).toArray()));
    }
}
