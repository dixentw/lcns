package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class DecodeWaysTest {
    DecodeWays s = new DecodeWays();
    @Test
    public void test1(){
        assertEquals(2, s.numDecodings("12"));
        assertEquals(3, s.numDecodings("226"));
        assertEquals(0, s.numDecodings("0"));
        assertEquals(1, s.numDecodings("10"));
    }
}
