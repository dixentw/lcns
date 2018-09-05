package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LongestPalindromeTest {
    @Test
    public void test1(){
        LongestPalindrome s = new LongestPalindrome();
        assertEquals("bab", s.longestPalindrome("babad"));
    }
    @Test
    public void test2(){
        LongestPalindrome s = new LongestPalindrome();
        assertEquals("bb", s.longestPalindrome("cbbd"));
    }
}
