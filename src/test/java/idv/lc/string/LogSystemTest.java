package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LogSystemTest {
    @Test
    public void test1(){
        LogSystem s = new LogSystem();
        s.put(1, "2017:01:01:23:59:59");
        s.put(2, "2017:01:01:22:59:59");
        s.put(3, "2016:01:01:00:00:00");
        List<Integer> res = s.retrieve("2016:01:01:01:01:01","2017:01:01:23:00:00","Year");
        assertEquals("[1, 3, 2]", Arrays.toString(res.toArray()));

    }
}
