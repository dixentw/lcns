package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC684Test {
    LC684 s = new LC684();
    @Test
    public void test1(){
        int[][] arr = new int[][]{
            {1,2}, {1,3}, {2,3}
        };
        int[] res = s.findRedundantConnection(arr);
        assertEquals("[2, 3]", Arrays.toString(res));
    }
}
