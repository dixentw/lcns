package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class SumRangeTest {
    SumRange s = new SumRange();
    @Test
    public void test1(){
        List<String> r = s.summaryRanges(new int[]{0});
        assertEquals("[0]", Arrays.toString(r.toArray()));
    }
    @Test
    public void test2(){
        List<String> r = s.summaryRanges(new int[]{0,1,2,4,5,7});
        assertEquals("[0->2, 4->5, 7]", Arrays.toString(r.toArray()));
    }
    @Test
    public void test3(){
        List<String> r = s.summaryRanges(new int[]{0,2,3,4,6,8,9});
        assertEquals("[0, 2->4, 6, 8->9]", Arrays.toString(r.toArray()));
    }
}
