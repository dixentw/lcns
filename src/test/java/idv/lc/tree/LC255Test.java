package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC255Test {
    LC255 s = new LC255();
    @Test
    public void test1(){
        assertFalse(s.verifyPreorder(new int[]{5,2,6,1,3}));
        assertTrue(s.verifyPreorder(new int[]{5,2,1,3,6}));
        assertTrue(s.verifyPreorder(new int[]{1,2}));
        assertTrue(s.verifyPreorder(new int[]{2,1}));
        assertFalse(s.verifyPreorder(new int[]{1,3,4,2}));
        assertFalse(s.verifyPreorder(new int[]{4,2,3,1}));
    }
}
