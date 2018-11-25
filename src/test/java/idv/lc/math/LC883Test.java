package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC883Test {
    LC883 s = new LC883();
    @Test
    public void test1(){
        assertEquals(17,s.projectionArea(new int[][]{{1,2}, {3,4}}));
        assertEquals(5,s.projectionArea(new int[][]{{2}}));
        assertEquals(8,s.projectionArea(new int[][]{{1,0}, {0,2}}));
        assertEquals(14,s.projectionArea(new int[][]{{1,1,1}, {1,0,1}, {1,1,1}}));
    }
}
