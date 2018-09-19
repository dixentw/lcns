package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class CountBinarySubstringsTest {
    CountBinarySubstrings s = new CountBinarySubstrings();
    @Test
    public void test1(){
        assertEquals(1,s.countBinarySubstrings("100"));
        assertEquals(1,s.countBinarySubstrings("10"));
        assertEquals(4,s.countBinarySubstrings("10101"));
        assertEquals(6,s.countBinarySubstrings("00110011"));
    }
}
