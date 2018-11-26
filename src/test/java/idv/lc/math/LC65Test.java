package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC65Test {
    LC65 s = new LC65();
    @Test
    public void test1(){
        assertTrue(s.isNumber("1.4"));
        assertTrue(s.isNumber("1.4e3"));
        assertFalse(s.isNumber("1.4e"));
        assertTrue(s.isNumber("-1.4e30"));
        assertFalse(s.isNumber("-+1.4e30"));
        assertTrue(s.isNumber("10.04"));
        assertTrue(s.isNumber("10"));
        assertTrue(s.isNumber(".4"));
    }
}
