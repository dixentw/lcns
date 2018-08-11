package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class Subset2Test {
    Subset2 s = new Subset2();
    @Test
    public void test1(){
        List<List<Integer>> res = s.subsetsWithDup(new int[]{1,2,2});
        assertEquals("[]", Arrays.toString(res.get(0).toArray()));
        assertEquals("[1]", Arrays.toString(res.get(1).toArray()));
        assertEquals("[1, 2]", Arrays.toString(res.get(2).toArray()));
        assertEquals("[1, 2, 2]", Arrays.toString(res.get(3).toArray()));
        assertEquals("[2]", Arrays.toString(res.get(4).toArray()));
        assertEquals("[2, 2]", Arrays.toString(res.get(5).toArray()));
    }
}
