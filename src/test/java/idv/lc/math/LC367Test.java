package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC367Test {
    LC367 s = new LC367();
    @Test
    public void test1(){
        assertTrue(s.isPerfectSquare(16));
        assertFalse(s.isPerfectSquare(14));
    }
}
