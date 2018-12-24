package idv.lc.bt;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC89Test {
    LC89 s = new LC89();
    @Test
    public void test1(){
        List<Integer> res = s.grayCode(2);
        assertEquals(0, (int)res.get(0));
        assertEquals(1, (int)res.get(1));
        assertEquals(3, (int)res.get(2));
        assertEquals(2, (int)res.get(3));
    }
    @Test
    public void test2(){
        List<Integer> res = s.grayCode(3);
        assertEquals(0, (int)res.get(0));
        assertEquals(1, (int)res.get(1));
        assertEquals(3, (int)res.get(2));
        assertEquals(2, (int)res.get(3));
        assertEquals(6, (int)res.get(4));
        assertEquals(7, (int)res.get(5));
        assertEquals(5, (int)res.get(6));
        assertEquals(4, (int)res.get(7));
    }
}
