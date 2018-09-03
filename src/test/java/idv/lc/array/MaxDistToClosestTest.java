package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MaxDistToClosestTest {
    MaxDistToClosest s = new MaxDistToClosest();
    @Test
    public void test1(){
        assertEquals(2, s.maxDistToClosest(new int[]{1,0,0,0,1,0,1}));
        assertEquals(3, s.maxDistToClosest(new int[]{1,0,0,0}));
        assertEquals(2, s.maxDistToClosest(new int[]{0,1,1,1,0,0,1,0,0}));
        assertEquals(3, s.maxDistToClosest(new int[]{0,0,0,1,1,0,1,1,0,0,0,1,0,0,1,0,0}));
    }
}
