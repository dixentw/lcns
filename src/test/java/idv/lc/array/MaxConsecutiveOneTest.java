package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MaxConsecutiveOneTest {
    MaxConsecutiveOne s = new MaxConsecutiveOne();
    @Test
    public void test1(){
        assertEquals(3, s.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
        assertEquals(0, s.findMaxConsecutiveOnes(new int[]{0}));
        assertEquals(1, s.findMaxConsecutiveOnes(new int[]{1,0,1,0,1}));
    }
}
