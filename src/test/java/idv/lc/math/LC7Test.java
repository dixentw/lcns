package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC7Test {
    LC7 s = new LC7();
    @Test
    public void test1(){
        assertEquals(321, s.reverse(123));
        assertEquals(321, s.reverse(12300));
        assertEquals(-321, s.reverse(-123));
        assertEquals(21, s.reverse(120));
        assertEquals(0, s.reverse(2147483647));
    }
}
