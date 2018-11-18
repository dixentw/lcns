package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC343Test {
    LC343 s = new LC343();
    @Test
    public void test1(){
        assertEquals(1, s.integerBreak(2));
        assertEquals(36, s.integerBreak(10));
    }
}
