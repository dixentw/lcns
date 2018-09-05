package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class NoRepeatSeqTest {
    NoRepeatSeq s = new NoRepeatSeq();
    @Test
    public void test1(){
        assertEquals(3, s.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, s.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, s.lengthOfLongestSubstring("pwwkew"));
    }
}
