package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC166Test {
    LC166 s = new LC166();
    @Test
    public void test1(){
        assertEquals("0.5", s.fractionToDecimal(1, 2));
        assertEquals("0.11", s.fractionToDecimal(11, 100));
        assertEquals("0.111", s.fractionToDecimal(111, 1000));
    }
}
