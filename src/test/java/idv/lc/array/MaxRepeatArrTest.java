package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MaxRepeatArrTest {
    MaxRepeatArr s = new MaxRepeatArr();
    @Test
    public void test1(){
        int len = s.findLength(new int[]{1,2,3,2,1}, new int[]{3,2,1,4,7});
        assertEquals(3, len);
        len = s.findLength(new int[]{0,0,0,0,0,0,1,0,0,0}, new int[]{0,0,0,0,0,0,0,1,0,0});
        assertEquals(9, len);

    }
}
