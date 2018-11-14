package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC279Test {
    LC279 s = new LC279();
    @Test
    public void test1(){
        assertEquals(3, s.numSquares(12));
        assertEquals(2, s.numSquares(13));
    }
}
