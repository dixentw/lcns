package idv.lc.dp;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC523Test {
    LC523 s = new LC523();
    @Test
    public void test1(){
        assertTrue(s.checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6));
        assertTrue(s.checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 6));
        assertTrue(s.checkSubarraySum(new int[]{0, 0}, 0));
        assertFalse(s.checkSubarraySum(new int[]{0, 1, 0}, 0));
    }
}
