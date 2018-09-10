package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class OneEditDistanceTest {
    OneEditDistance s = new OneEditDistance();
    @Test
    public void test1(){
        assertTrue(s.isOneEditDistance("ab", "acb"));
        assertFalse(s.isOneEditDistance("cab", "ad"));
        assertTrue(s.isOneEditDistance("1203", "1213"));
    }
}
