package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ValidPalindromeTest {
    ValidPalindrome s = new ValidPalindrome();
    @Test
    public void test1(){
        assertTrue(s.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(s.isPalindrome("race a car"));
        assertFalse(s.isPalindrome("0P"));
    }
}
