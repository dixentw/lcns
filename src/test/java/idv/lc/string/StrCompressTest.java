package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class StrCompressTest {
    StrCompress s = new StrCompress();
    @Test
    // test all different
    public void test1(){
        char[] q = new char[]{'a', 'b', 'c'};
        assertEquals(3, s.compress(q));
        // test last non repeat
        q = new char[]{'a', 'a','a','a','b', 'c'};
        assertEquals(4, s.compress(q));
        assertEquals("[a, 4, b, c, b, c]", Arrays.toString(q));
        // test start non repeat
        q = new char[]{'a', 'b', 'c', 'c', 'c', 'c'};
        assertEquals(4, s.compress(q));
        assertEquals("[a, b, c, 4, c, c]", Arrays.toString(q));
    }
}
