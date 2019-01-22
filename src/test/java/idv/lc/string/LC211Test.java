package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC211Test {
    LC211 s = new LC211();
    @Test
    public void test1(){
        s.addWord("bad");
        s.addWord("mad");
        s.addWord("dad");
        assertFalse(s.search("pad"));
        assertTrue(s.search("bad"));
        assertTrue(s.search(".ad"));
        assertTrue(s.search("b.."));
    }
}
