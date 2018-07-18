package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MaxSwapTest {
    MaxSwap s = new MaxSwap();
    @Test
    public void test1(){
        assertEquals(7236, s.maximumSwap(2736));
        assertEquals(9973, s.maximumSwap(9973));
        assertEquals(98863, s.maximumSwap(98368));
        assertEquals(9913, s.maximumSwap(1993));
    }
}
