package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC812Test {
    LC812 s = new LC812();
    @Test
    public void test1(){
        double res = s.largestTriangleArea(new int[][]{
            {0,0},
            {0,1},
            {1,0},
            {0,2},
            {2,0}
        });
        assertEquals(2.0, res, 0.00001);
    }
}
