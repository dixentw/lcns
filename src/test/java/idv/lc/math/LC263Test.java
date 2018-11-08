package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC263Test {
    LC263 s = new LC263();
    @Test
    public void test1(){
        assertTrue(s.isUgly(6));
        assertFalse(s.isUgly(0));
        assertTrue(s.isUgly(1));
        assertFalse(s.isUgly(14));
    }
}
