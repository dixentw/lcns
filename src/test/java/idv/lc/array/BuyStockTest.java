package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class BuyStockTest {
    BuyStock s = new BuyStock();
    @Test
    public void test1(){
        int[] arr = new int[]{7,1,5,3,6,4};
        assertEquals(5, s.maxProfit(arr));
        arr = new int[]{7,6,4,3,1};
        assertEquals(0, s.maxProfit(arr));
    }
}
