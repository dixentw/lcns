package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ProductSubLessTest {
    ProductSubLess s = new ProductSubLess();
    @Test
    public void test1(){
        assertEquals(8, s.numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100));
    }
}
