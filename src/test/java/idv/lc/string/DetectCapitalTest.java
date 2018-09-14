package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class DetectCapitalTest {
    DetectCapital s = new DetectCapital();
    @Test
    public void test1(){
        assertTrue(s.detectCapitalUse("USA"));
        assertTrue(s.detectCapitalUse("leetcode"));
        assertTrue(s.detectCapitalUse("Google"));
        assertFalse(s.detectCapitalUse("flaG"));
    }
}
