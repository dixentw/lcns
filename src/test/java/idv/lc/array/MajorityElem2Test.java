package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MajorityElem2Test {
    MajorityElem2 s = new MajorityElem2();
    @Test
    public void test0(){
        List<Integer> res = s.majorityElement(new int[]{1});
        assertEquals(1, res.size());
        assertEquals(1, (int)res.get(0));
    }
    @Test
    public void test1(){
        List<Integer> res = s.majorityElement(new int[]{3,2,3});
        assertEquals(1, res.size());
        assertEquals(3, (int)res.get(0));
    }
    @Test
    public void test2(){
        List<Integer> res = s.majorityElement(new int[]{1,1,1,3,3,2,2,2});
        assertEquals(2, res.size());
        assertEquals(1, (int)res.get(0));
        assertEquals(2, (int)res.get(1));
    }
    @Test
    public void test3(){
        List<Integer> res = s.majorityElement(new int[]{2,2,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9});
        assertEquals(2, res.size());
        assertEquals(3, (int)res.get(0));
        assertEquals(9, (int)res.get(1));
    }
}
