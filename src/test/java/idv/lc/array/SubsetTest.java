package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class SubsetTest {
    Subset s = new Subset();
    @Test
    public void test1(){
        List<List<Integer>> res = s.subsets(new int[]{1,2,3});
        assertEquals("[]", Arrays.toString(res.get(0).toArray()));
        assertEquals("[1]", Arrays.toString(res.get(1).toArray()));
        assertEquals("[1, 2]", Arrays.toString(res.get(2).toArray()));
        assertEquals("[1, 2, 3]", Arrays.toString(res.get(3).toArray()));
        assertEquals("[1, 3]", Arrays.toString(res.get(4).toArray()));
    }
}
