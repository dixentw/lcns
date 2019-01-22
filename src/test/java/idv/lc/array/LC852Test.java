package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC852Test {
    LC852 s = new LC852();
    @Test
    public void test1(){
        assertEquals(1, s.peakIndexInMountainArray(new int[]{0,1,0}));
        assertEquals(1, s.peakIndexInMountainArray(new int[]{0,2,1,0}));
    }
}
