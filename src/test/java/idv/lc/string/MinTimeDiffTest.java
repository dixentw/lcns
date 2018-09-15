package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MinTimeDiffTest {
    MinTimeDiff s = new MinTimeDiff();
    @Test
    public void test1(){
        assertEquals(1, s.findMinDifference(Arrays.asList(new String[]{"23:59", "00:00"})));
        assertEquals(0, s.findMinDifference(Arrays.asList(new String[]{"00:00", "23:59", "00:00"})));
    }
}
