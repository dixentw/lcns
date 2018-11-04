package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC172Test {
    LC172 s = new LC172();
    @Test
    public void test1(){
        assertEquals(0, s.trailingZeroes(3));
        assertEquals(1, s.trailingZeroes(5));
    }
}
