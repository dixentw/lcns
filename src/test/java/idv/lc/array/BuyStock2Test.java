package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class BuyStock2Test {
    BuyStock2 s = new BuyStock2();
    @Test
    public void test1(){
        assertEquals(7, s.maxProfit(new int[]{7,1,5,3,6,4}));
        assertEquals(4, s.maxProfit(new int[]{1,2,3,4,5}));
        assertEquals(0, s.maxProfit(new int[]{7,6,4,3,1}));
    }
}
