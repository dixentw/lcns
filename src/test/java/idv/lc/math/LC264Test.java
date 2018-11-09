package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC264Test {
    LC264 s = new LC264();
    @Test
    public void test1(){
        assertEquals(12, s.nthUglyNumber(10));
    }
}
