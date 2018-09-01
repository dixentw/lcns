package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ThreeSumClosestTest {
    ThreeSumClosest s = new ThreeSumClosest();
    @Test
    public void test1(){
        int sum = s.threeSumClosest(new int[]{-1, 2, 1, -4}, 1);
        assertEquals(2, sum);
    }
}
