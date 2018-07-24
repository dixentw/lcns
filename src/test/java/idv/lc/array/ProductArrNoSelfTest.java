package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ProductArrNoSelfTest {
    ProductArrNoSelf s = new ProductArrNoSelf();
    @Test
    public void test1(){
        int [] res = s.productExceptSelf(new int[]{1,2,3,4});
        assertEquals("[24, 12, 8, 6]", Arrays.toString(res));
    }
}

