package idv.lc.bfs;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC785Test {
    LC785 s = new LC785();
    @Test
    public void test1(){
        int[][] g = new int[][]{
            {1,3}, {0,2}, {1,3}, {0,2}
        };
        assertTrue(s.isBipartite(g));
    }
    @Test
    public void test2(){
        int[][] g = new int[][]{
            {1,2,3}, {0,2}, {0,1,3}, {0,2}
        };
        assertFalse(s.isBipartite(g));
    }
}
