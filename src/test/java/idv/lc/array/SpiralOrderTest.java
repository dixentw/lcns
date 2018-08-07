package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class SpiralOrderTest {
    SpiralOrder s = new SpiralOrder();
    @Test
    public void test1(){
        int[][] grid = new int[1][1];
        grid[0][0] = 3;
        List<Integer> res;
        res = s.spiralOrder(grid);
        assertEquals("[3]", Arrays.toString(res.toArray()));
        grid = new int[][]{
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };
        res = s.spiralOrder(grid);
        assertEquals("[1, 2, 3, 6, 9, 8, 7, 4, 5]", Arrays.toString(res.toArray()));
        grid = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9,10,11,12}
        };
        res = s.spiralOrder(grid);
        assertEquals("[1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]", Arrays.toString(res.toArray()));
        grid = new int[][]{
            {6, 7, 8},
        };
        res = s.spiralOrder(grid);
        assertEquals("[6, 7, 8]", Arrays.toString(res.toArray()));
    }
}
