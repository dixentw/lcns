package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class BuddyStringsTest {
    BuddyStrings s = new BuddyStrings();
    @Test
    public void test1(){
        assertTrue(s.buddyStrings("ab", "ba"));
        assertFalse(s.buddyStrings("ab", "ab"));
        assertTrue(s.buddyStrings("aa", "aa"));
        assertTrue(s.buddyStrings("aaaaaaabc", "aaaaaaacb"));
        assertFalse(s.buddyStrings("", "ab"));
    }
}
