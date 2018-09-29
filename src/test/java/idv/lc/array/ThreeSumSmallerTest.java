package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ThreeSumSmallerTest {
    ThreeSumSmaller s = new ThreeSumSmaller();
    @Test
    public void test1(){
        assertEquals(2, s.threeSumSmaller(new int[]{-2,0,1,3}, 2));
    }
}
