package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class RansomNoteTest {
    RansomNote s = new RansomNote();
    @Test
    public void test1(){
        assertFalse(s.canConstruct("a", "b"));
        assertFalse(s.canConstruct("aa", "ab"));
        assertTrue(s.canConstruct("aa", "aab"));
    }
}
