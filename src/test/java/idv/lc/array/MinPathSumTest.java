package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MinPathSumTest {
    MinPathSum s = new MinPathSum();
    @Test
    public void test1(){
        int[][] arr = new int[][]{
            {1,3,1},
            {1,5,1},
            {4,2,1}
        };
        assertEquals(7, s.minPathSum(arr));
    }
}
