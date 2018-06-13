package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class BoundMaxSubArrTest {
    BoundMaxSubArr s = new BoundMaxSubArr();
    @Test
    public void test1(){
        assertEquals(3, s.numSubarrayBoundedMax(new int[]{2,1,4,3}, 2, 3));
    }
}
