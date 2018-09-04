package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class FairCandySwapTest {
    FairCandySwap s = new FairCandySwap();
    @Test
    public void test1(){
        int[] res = s.fairCandySwap(new int[]{1,1}, new int[]{2,2});
        assertEquals(1, res[0]);
        assertEquals(2, res[1]);
    }
    @Test
    public void test2(){
        int[] res = s.fairCandySwap(new int[]{1,2,5}, new int[]{2,4});
        assertEquals(5, res[0]);
        assertEquals(4, res[1]);
    }
}
