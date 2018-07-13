package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MaxAvgSubTest {
    MaxAvgSub s = new MaxAvgSub();
    @Test
    public void test1(){
        assertEquals(12.75, s.findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4),0.0001);
        assertEquals(3.5, s.findMaxAverage(new int[]{4,3,2}, 2),0.0001);
        assertEquals(0, s.findMaxAverage(new int[]{-1, 1}, 2),0.0001);
        assertEquals(3.0, s.findMaxAverage(new int[]{4,2,1,3,3}, 2),0.0001);
    }
}
