package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC76Test {
    LC76 s = new LC76();
    @Test
    public void test1(){
        assertEquals("BANC", s.minWindow("ADOBECODEBANC", "ABC"));
    }
}
