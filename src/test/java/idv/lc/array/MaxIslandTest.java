package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MaxIslandTest {
    MaxIsland s = new MaxIsland();
    @Test
    public void test1(){
        int[][] map = new int[][]{
            {1},
        };
        assertEquals(1, s.maxAreaOfIsland(map));
        map = new int[][]{
            {0,0,0,0,0,0},
            {0,1,1,1,0,0},
            {0,0,0,0,1,1},
            {0,0,0,0,1,1},
        };
        assertEquals(4, s.maxAreaOfIsland(map));
    }
}
