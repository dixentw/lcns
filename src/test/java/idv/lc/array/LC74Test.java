package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC74Test {
    LC74 s = new LC74();
    @Test
    public void test1(){
        int[][] ma = new int[][]{
            {1,   4,  7, 11, 15},
            {2,   5,  8, 12, 19},
            {3,   6,  9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30},
        };
        assertTrue(s.searchMatrix(ma, 9));
    }
}
