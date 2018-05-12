package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ThirdMaxTest{
    ThirdMax s = new ThirdMax();
    @Test
    public void test1(){
        int[] arr = new int[]{3,2,1};
        assertEquals(1, s.thirdMax(arr));
        arr = new int[]{1,2};
        assertEquals(2, s.thirdMax(arr));
        arr = new int[]{2,2,3,1};
        assertEquals(1, s.thirdMax(arr));
    }
}
