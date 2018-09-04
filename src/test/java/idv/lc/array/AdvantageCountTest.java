package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class AdvantageCountTest {
    AdvantageCount s = new AdvantageCount();
    @Test
    public void test1(){
        int[] res = s.advantageCount(new int[]{2,7,11,15}, new int[]{1,10,4,11});
        assertEquals("[2, 11, 7, 15]", Arrays.toString(res));
    }
    @Test
    public void test2(){
        int[] res = s.advantageCount(new int[]{12,24,8,32}, new int[]{13,25,32,11});
        assertEquals("[24, 32, 8, 12]", Arrays.toString(res));
    }
}
