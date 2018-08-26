package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class TwoSum2Test {
    TwoSum2 s = new TwoSum2();
    @Test
    public void test1(){
        int[] res = s.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertEquals(1, res[0]);
        assertEquals(2, res[1]);
    }
}
