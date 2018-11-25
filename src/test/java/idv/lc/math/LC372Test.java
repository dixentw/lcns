package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC372Test {
    LC372 s = new LC372();
    @Test
    public void test1(){
        assertEquals(1024, s.superPow(2, new int[]{1,0}));
        assertEquals(1198, s.superPow(2147483647, new int[]{2,0,0}));
    }
}
