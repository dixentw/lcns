package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ReorganizeStringTest {
    ReorganizeString s = new ReorganizeString();
    @Test
    public void test1(){
        assertEquals("", s.reorganizeString("aaab"));
        assertEquals("aba", s.reorganizeString("aab"));
    }
}
