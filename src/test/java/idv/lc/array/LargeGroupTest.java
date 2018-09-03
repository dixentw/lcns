package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LargeGroupTest {
    LargeGroup s = new LargeGroup();
    @Test
    public void test1(){
        List<List<Integer>> res = s.largeGroupPositions("abbxxxxzzy");
        assertEquals("[3, 6]", Arrays.toString(res.get(0).toArray()));
    }
    @Test
    public void test2(){
        List<List<Integer>> res = s.largeGroupPositions("abc");
        assertEquals(0, res.size());
    }
    @Test
    public void test3(){
        List<List<Integer>> res = s.largeGroupPositions("abcdddeeeeaabbbcd");
        assertEquals("[3, 5]", Arrays.toString(res.get(0).toArray()));
        assertEquals("[6, 9]", Arrays.toString(res.get(1).toArray()));
        assertEquals("[12, 14]", Arrays.toString(res.get(2).toArray()));
    }
}
