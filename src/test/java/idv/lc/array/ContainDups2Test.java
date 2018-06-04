package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ContainDups2Test {
    ContainDups2 s = new ContainDups2();
    @Test
    public void test1(){
        assertTrue(s.containsNearbyDuplicate2(new int[]{1,2,3,1}, 3));
        assertTrue(s.containsNearbyDuplicate2(new int[]{1,0,1,1}, 1));
        assertFalse(s.containsNearbyDuplicate2(new int[]{1,2,3,1,2,3}, 2));
    }
}
