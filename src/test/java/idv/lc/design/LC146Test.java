package idv.lc.design;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC146Test {
    @Test
    public void test1(){
        LC146 s = new LC146(2);
        s.put(1, 1);
        s.put(2, 2);
        assertEquals(1, s.get(1));
        s.put(3,3);
        assertEquals(-1, s.get(2));
        s.put(4,4);
        assertEquals(-1, s.get(1));
        assertEquals(3, s.get(3));
        assertEquals(4, s.get(4));
    }
}
