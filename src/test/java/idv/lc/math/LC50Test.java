package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC50Test {
    LC50 s = new LC50();
    @Test
    public void test1(){
        assertEquals(1024, s.myPow(2.0, 10), 0.000);
    }
}
