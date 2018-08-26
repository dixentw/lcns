package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class CombinationSum3Test {
    CombinationSum3 s = new CombinationSum3();
    @Test
    public void test1(){
        List<List<Integer>> result = s.combinationSum3(3, 7);
        assertEquals("[1, 2, 4]", Arrays.toString(result.get(0).toArray()));
    }
    @Test
    public void test2(){
        List<List<Integer>> result = s.combinationSum3(3, 9);
        assertEquals("[1, 2, 6]", Arrays.toString(result.get(0).toArray()));
        assertEquals("[1, 3, 5]", Arrays.toString(result.get(1).toArray()));
        assertEquals("[2, 3, 4]", Arrays.toString(result.get(2).toArray()));
    }
}
