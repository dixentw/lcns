package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC633Test {
    LC633 s = new LC633();
    @Test
    public void test1(){
        assertTrue(s.judgeSquareSum(5));
        assertFalse(s.judgeSquareSum(3));
        assertTrue(s.judgeSquareSum(4));
        assertTrue(s.judgeSquareSum(2));
    }
}
