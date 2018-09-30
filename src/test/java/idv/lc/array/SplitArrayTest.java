package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class SplitArrayTest {
    SplitArray s = new SplitArray();
    @Test
    public void test1(){
        assertTrue(s.splitArray(new int[]{1,2,1,2,1,2,1}));
        assertTrue(s.splitArray(new int[]{1,2,1,3,0,0,2,2,1,3,3}));
    }
}
