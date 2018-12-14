package idv.lc.dfs;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC200Test {
    LC200 s = new LC200();
    @Test
    public void test1(){
        char[][] g = new char[][]{
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'},
        };
        assertEquals(3, s.numIslands(g));
    }
}
