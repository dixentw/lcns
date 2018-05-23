package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class KDiffPairTest {
    KDiffPair s = new KDiffPair();
    @Test
    public void test1(){
        assertEquals(2, s.findPairs(new int[]{3,1,4,1,5}, 2));
        assertEquals(4, s.findPairs(new int[]{1,2,3,4,5}, 1));
        assertEquals(1, s.findPairs(new int[]{1,1,1,1,1}, 0));
    }
}
