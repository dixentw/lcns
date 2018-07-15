package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class SubDegreeTest {
    SubDegree s = new SubDegree();
    @Test
    public void test1(){
        assertEquals(2, s.findShortestSubArray(new int[]{1, 2, 2, 3, 1}));
        assertEquals(6, s.findShortestSubArray(new int[]{1, 2, 2, 3, 1, 4, 2}));
    }
}
