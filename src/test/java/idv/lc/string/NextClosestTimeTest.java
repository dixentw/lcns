package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class NextClosestTimeTest {
    NextClosestTime s = new NextClosestTime();
    @Test
    public void test1(){
        assertEquals("19:39", s.nextClosestTime("19:34"));
        assertEquals("22:22", s.nextClosestTime("23:59"));
    }
}
