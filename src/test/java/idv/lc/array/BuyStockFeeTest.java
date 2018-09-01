package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class BuyStockFeeTest {
    BuyStockFee s = new BuyStockFee();
    @Test
    public void test1(){
        assertEquals(8, s.maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2));
    }
}
