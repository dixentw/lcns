package idv.lc.greedy;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC253Test {
    LC253 s = new LC253();
    @Test
    public void test1(){
        Interval[] input = new Interval[]{new Interval(0, 30), new Interval(5, 10), new Interval(15, 20)};
        assertEquals(2, s.minMeetingRooms(input));
    }
}
