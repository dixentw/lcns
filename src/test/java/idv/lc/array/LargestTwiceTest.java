package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LargestTwiceTest {
    LargestTwice s = new LargestTwice();
    @Test
    public void test1(){
        assertEquals(1, s.dominantIndex(new int[]{3,6,1,0}));
        assertEquals(-1, s.dominantIndex(new int[]{1,2,3,4}));
    }
}
