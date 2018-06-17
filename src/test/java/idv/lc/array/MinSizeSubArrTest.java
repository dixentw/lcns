package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MinSizeSubArrTest {
    MinSizeSubArr s = new MinSizeSubArr();
    @Test
    public void test1(){
        assertEquals(2, s.minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }
}
