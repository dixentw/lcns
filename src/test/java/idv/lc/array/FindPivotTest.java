package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class FindPivotTest {
    FindPivot s = new FindPivot();
    @Test
    public void test1(){
        assertEquals(0, s.pivotIndex(new int[]{1, -1, 1}));
        assertEquals(3, s.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        assertEquals(-1, s.pivotIndex(new int[]{1,2,3}));
    }
}
