package idv.lc.stack;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC636Test {
    LC636 s = new LC636();
    @Test
    public void test1(){
        List<String> logs = new ArrayList<>();
        logs.add("0:start:0");
        logs.add("1:start:2");
        logs.add("1:end:5");
        logs.add("0:end:6");
        int[] res = s.exclusiveTime(2, logs);
        assertEquals(3, res[0]);
        assertEquals(4, res[1]);
    }
}
