package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC400Test {
    LC400 s = new LC400();
    @Test
    public void test1(){
        assertEquals(4, s.findNthDigit(4));
        assertEquals(0, s.findNthDigit(11));
        assertEquals(1, s.findNthDigit(1000000000));
    }
}
