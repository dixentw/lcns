package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MinRotateArrTest {
    MinRotateArr s = new MinRotateArr();
    @Test
    public void test1(){
        assertEquals(1, s.findMin(new int[]{3,4,5,1,2}));
        assertEquals(0, s.findMin(new int[]{4,5,6,7,0,1,2}));
        assertEquals(1, s.findMin(new int[]{2,1}));
    }
}
