package idv.lc.bit;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC461Test {
    LC461 s = new LC461();
    @Test
    public void test1(){
        assertEquals(2, s.hammingDistance(1, 4));
        assertEquals(2, s.hammingDistance(-1, 4));
    }
}
