package idv.lc.misc;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC252Test {
    LC252 s = new LC252();
    @Test
    public void test1(){
        Interval[] ins = new Interval[]{new Interval(7, 10), new Interval(2, 4)};
        assertTrue(s.canAttendMeetings(ins));
    }
    @Test
    public void test2(){
        Interval[] ins = new Interval[]{new Interval(0, 30), new Interval(5, 10), new Interval(15, 20)};
        assertFalse(s.canAttendMeetings(ins));
    }
}
