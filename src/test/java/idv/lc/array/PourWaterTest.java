package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class PourWaterTest {
    PourWater s = new PourWater();
    @Test
    public void test1(){
        int[] res = s.pourWater(new int[]{2,1,1,2,1,2,2}, 4, 3);
        assertEquals("[2, 2, 2, 3, 2, 2, 2]", Arrays.toString(res));
    }
    @Test
    public void test2(){
        int[] res = s.pourWater(new int[]{1,2,3,4}, 2, 2);
        assertEquals("[2, 3, 3, 4]", Arrays.toString(res));
    }
}
