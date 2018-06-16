package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MinCostClimbTest {
    MinCostClimb s = new MinCostClimb();
    @Test
    public void test1(){
        assertEquals(15, s.minCostClimbingStairs(new int[]{10, 15, 20}));
        assertEquals(6, s.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}
