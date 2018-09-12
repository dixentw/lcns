package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class CompareVersionTest {
    CompareVersion s = new CompareVersion();
    @Test
    public void test1(){
        assertEquals(-1, s.compareVersion("0.1", "1.1"));
        assertEquals(1, s.compareVersion("1.0.1", "1"));
        assertEquals(1, s.compareVersion("7.6.5.4", "7.6.4"));
        assertEquals(1, s.compareVersion("7.6.5", "7.6.4.5"));
    }
}
