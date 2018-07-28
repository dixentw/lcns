package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MxProductTest {
    MxProduct s = new MxProduct();
    @Test
    public void test1(){
        assertEquals(6, s.maximumProduct(new int[]{1,2,3}));
        assertEquals(24, s.maximumProduct(new int[]{1,2,3,4}));
        assertEquals(135, s.maximumProduct(new int[]{-9, -5, 1 , 2 ,3}));
    }
}
