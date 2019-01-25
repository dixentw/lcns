package idv.lc.heap;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC347Test {
    LC347 s = new LC347();
    @Test
    public void test1(){
        List<Integer> res = s.topKFrequent(new int[]{1,1,1,2,2,3}, 2);
        assertEquals(1,(int)res.get(0));
        assertEquals(2,(int)res.get(1));
    }
}
