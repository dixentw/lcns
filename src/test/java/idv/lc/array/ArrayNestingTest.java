package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ArrayNestingTest {
    ArrayNesting s = new ArrayNesting();
    @Test
    public void test1(){
        assertEquals(4, s.arrayNesting(new int[]{5,4,0,3,1,6,2}));
    }
}
