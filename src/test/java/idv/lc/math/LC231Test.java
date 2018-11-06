package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC231Test {
    LC231 s = new LC231();
    @Test
    public void test1(){
        assertTrue(s.isPowerOfTwo(1));
        assertTrue(s.isPowerOfTwo(16));
        assertFalse(s.isPowerOfTwo(218));
    }
}
