package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LongestLineTest {
    LongestLine s = new LongestLine();
    @Test
    public void test0(){
        int[][] M = new int[][]{
            {1,1,1,1},
        };
        assertEquals(4, s.longestLine(M));
    }
    @Test
    public void test1(){
        int[][] M = new int[][]{
            {0,1,1,0},
            {0,1,1,0},
            {0,0,0,1},
        };
        assertEquals(3, s.longestLine(M));
    }
    @Test
    public void test2(){
        int[][] M = new int[][]{
            {0,1,0,1,1},
            {1,1,0,0,1},
            {0,0,0,1,0},
            {1,0,1,1,1},
            {1,0,0,0,1}
        };
        assertEquals(3, s.helper(M, 1, 4, 3));
    }
}
