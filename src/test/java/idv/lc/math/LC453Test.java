package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC453Test {
    LC453 s = new LC453();
    @Test
    public void test1(){
        assertEquals(3, s.minMoves(new int[]{1,2,3}));
    }
}
