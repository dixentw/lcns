package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LCISTest {
    LCIS s = new LCIS();
    @Test
    public void test1(){
        assertEquals(3, s.findLengthOfLCIS(new int[]{1,3,5,4,7}));
        assertEquals(3, s.findLengthOfLCIS(new int[]{1,3,5,4,7}));
        //你忘了這個
        assertEquals(5, s.findLengthOfLCIS(new int[]{1,2,3,4,5}));
        //還有這個
        assertEquals(0, s.findLengthOfLCIS(new int[]{}));
    }
}
