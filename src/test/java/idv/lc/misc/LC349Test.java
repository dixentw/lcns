package idv.lc.misc;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC349Test {
    LC349 s = new LC349();
    @Test
    public void test1(){
        int[] a1 = new int[]{1,2,2,1};
        int[] a2 = new int[]{2,2};
        int[] res = s.intersection(a1, a2);
        assertEquals(2, res[0]);
    }
    @Test
    public void test2(){
        int[] a1 = new int[]{4,9,5};
        int[] a2 = new int[]{9,4,9,8,4};
        int[] res = s.intersection(a1, a2);
        assertEquals(4, res[0]);
        assertEquals(9, res[1]);
    }
}
