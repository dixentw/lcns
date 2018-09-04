package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LongestFibSubseqTest {
    LongestFibSubseq s = new LongestFibSubseq();
    @Test
    public void test1(){
        assertEquals(5, s.lenLongestFibSubseq(new int[]{1,2,3,4,5,6,7,8}));
        assertEquals(3, s.lenLongestFibSubseq(new int[]{1,3,7,11,12,14,18}));
        assertEquals(0, s.lenLongestFibSubseq(new int[]{1,3,5}));
    }
}
