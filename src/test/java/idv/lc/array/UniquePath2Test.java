package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class UniquePath2Test {
    UniquePath2 s = new UniquePath2();
    @Test
    public void test1(){
        int[][] arr = new int[][]{
            {0,0,0},
            {0,1,0},
            {0,0,0}
        };
        assertEquals(2, s.uniquePathsWithObstacles(arr));
        arr = new int[][]{{1}};
        assertEquals(0, s.uniquePathsWithObstacles(arr));
        arr = new int[][]{{0,1}};
        assertEquals(0, s.uniquePathsWithObstacles(arr));

    }
}
