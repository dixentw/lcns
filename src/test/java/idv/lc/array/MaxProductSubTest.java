package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MaxProductSubTest {
    MaxProductSub s = new MaxProductSub();
    @Test
    public void test1(){
        assertEquals(6, s.maxProduct(new int[]{2,3,-2,4}));
        assertEquals(0, s.maxProduct(new int[]{-2, 0, -1}));
        assertEquals(-2, s.maxProduct(new int[]{-2}));
        assertEquals(2, s.maxProduct(new int[]{0, 2}));
        assertEquals(24, s.maxProduct(new int[]{-2,3,-4}));
    }
}
