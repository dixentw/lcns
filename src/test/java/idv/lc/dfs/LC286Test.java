package idv.lc.dfs;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC286Test {
    LC286 s = new LC286();
    @Test
    public void test1(){
        int INF = Integer.MAX_VALUE;
        int[][] rooms = new int[][]{
            {INF, -1, 0, INF},
            {INF, INF, INF, -1},
            {INF, -1, INF, -1},
            {0, -1, INF, INF}
        };
        s.wallsAndGates(rooms);
        assertEquals("[3, -1, 0, 1]", Arrays.toString(rooms[0]));
        assertEquals("[2, 2, 1, -1]", Arrays.toString(rooms[1]));
        assertEquals("[1, -1, 2, -1]", Arrays.toString(rooms[2]));
        assertEquals("[0, -1, 3, 4]", Arrays.toString(rooms[3]));
    }
}
