package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC204Test {
    LC204 s = new LC204();
    @Test
    public void test1(){
        assertEquals(4, s.countPrimes(10));
    }
}
