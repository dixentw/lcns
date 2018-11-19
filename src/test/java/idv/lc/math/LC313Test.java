package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC313Test {
    LC313 s = new LC313();
    @Test
    public void test1(){
        int ug = s.nthSuperUglyNumber(12, new int[]{2,7,13,19});
        assertEquals(32, ug);
    }
}
