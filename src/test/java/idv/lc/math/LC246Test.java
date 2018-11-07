package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC246Test {
    LC246 s = new LC246();
    @Test
    public void test1(){
        assertTrue(s.isStrobogrammatic("88"));
        assertTrue(s.isStrobogrammatic("69"));
        assertFalse(s.isStrobogrammatic("692"));
    }
}
