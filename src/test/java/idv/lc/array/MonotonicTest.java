package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MonotonicTest {
    Monotonic s = new Monotonic();
    @Test
    public void test1(){
        assertTrue(s.isMonotonic(new int[]{1,2,2,3}));
        assertTrue(s.isMonotonic(new int[]{1,1,1}));
        assertTrue(s.isMonotonic(new int[]{6,5,4,4}));
        assertFalse(s.isMonotonic(new int[]{1,3,2}));
    }
}
