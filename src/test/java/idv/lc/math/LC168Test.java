package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC168Test {
    LC168 s = new LC168();
    @Test
    public void test1(){
        assertEquals("AA", s.convertToTitle(27));
        assertEquals("Z", s.convertToTitle(26));
        assertEquals("C", s.convertToTitle(3));
        assertEquals("ZY", s.convertToTitle(701));
    }
}
