package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC69Test {
    LC69 s = new LC69();
    @Test
    public void test1(){
        assertEquals(2, s.mySqrt(4));
        assertEquals(2, s.mySqrt(8));
    }
}
