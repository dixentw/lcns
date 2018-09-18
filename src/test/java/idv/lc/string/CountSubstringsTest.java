package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class CountSubstringsTest {
    CountSubstrings s = new CountSubstrings();
    @Test
    public void test1(){
        assertEquals(3, s.countSubstrings("abc"));
        assertEquals(6, s.countSubstrings("aaa"));
    }
}
