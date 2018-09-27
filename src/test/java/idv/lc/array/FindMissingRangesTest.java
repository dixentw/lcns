package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class FindMissingRangesTest {
    FindMissingRanges s = new FindMissingRanges();
    @Test
    public void test1(){
        List<String> res = s.findMissingRanges(new int[]{0, 1, 3, 50, 75}, 0, 99);
        assertEquals("2", res.get(0));
        assertEquals("4->49", res.get(1));
        assertEquals("51->74", res.get(2));
        assertEquals("76->99", res.get(3));
    }
}
