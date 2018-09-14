package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class RepeatSubPatternTest {
    RepeatSubPattern s = new RepeatSubPattern();
    @Test
    public void test1(){
        assertTrue(s.repeatedSubstringPattern("abab"));
        assertFalse(s.repeatedSubstringPattern("aba"));
        assertTrue(s.repeatedSubstringPattern("abcabcabcabc"));
    }
}
