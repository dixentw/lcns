package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class SpiralMatrix2Test {
    SpiralMatrix2 s = new SpiralMatrix2();
    @Test
    public void test1(){
        int[][] grid = s.generateMatrix(3);
        assertEquals("[1, 2, 3]", Arrays.toString(grid[0]));
        assertEquals("[8, 9, 4]", Arrays.toString(grid[1]));
        assertEquals("[7, 6, 5]", Arrays.toString(grid[2]));
    }
}
