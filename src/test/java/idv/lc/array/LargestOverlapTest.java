package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LargestOverlapTest {
    LargestOverlap s = new LargestOverlap();
    @Test
    public void test1(){
        int[][] A = new int[][]{
            {1,1,0},
            {0,1,0},
            {0,1,0}
        };
        int[][] B = new int[][]{
            {0,0,0},
            {0,1,1},
            {0,0,1}
        };
        assertEquals(3, s.largestOverlap(A, B));

    }
    @Test
    public void test2(){
        int[][] A = new int[][]{
            {1,0},
            {0,0},
        };
        int[][] B = new int[][]{
            {0,1},
            {1,0},
        };
        assertEquals(1, s.largestOverlap(A, B));

    }
}
