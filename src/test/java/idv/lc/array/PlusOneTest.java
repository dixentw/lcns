package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class PlusOneTest {
    PlusOne s = new PlusOne();
    @Test
    public void test1(){
        int[] arr = new int[]{1,2,3};
        assertEquals("[1, 2, 4]", Arrays.toString(s.plusOneV2(arr)));
        arr = new int[]{4,3,2,1};
        assertEquals("[4, 3, 2, 2]", Arrays.toString(s.plusOneV2(arr)));
        arr = new int[]{9,9};
        assertEquals("[1, 0, 0]", Arrays.toString(s.plusOneV2(arr)));
    }
}
