package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ValidPalindrome2Test {
    ValidPalindrome2 s = new ValidPalindrome2();
    @Test
    public void test1(){
        assertTrue(s.validPalindrome("aba"));
        assertFalse(s.validPalindrome("abc"));
        assertTrue(s.validPalindrome("abca"));
        assertTrue(s.validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }
}
