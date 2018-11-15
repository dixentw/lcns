package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC415Test {
    LC415 s = new LC415();
    @Test
    public void test1(){
        assertEquals("444", s.addStrings("100", "344"));
        assertEquals("354", s.addStrings("10", "344"));
        assertEquals("134", s.addStrings("100", "34"));
        assertEquals("1000", s.addStrings("999", "1"));
    }
}
