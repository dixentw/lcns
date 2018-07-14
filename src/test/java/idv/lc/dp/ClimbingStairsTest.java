package idv.lc.dp;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ClimbingStairsTest {
    ClimbingStairs s = new ClimbingStairs();
    @Test
    public void test1(){
        assertEquals(2, s.climbStairs(2));
        assertEquals(3, s.climbStairs(3));
    }
}
