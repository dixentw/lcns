package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC9Test {
    LC9 s = new LC9();
    @Test
    public void test1(){
        assertTrue(s.isPalindrome(121));
        assertFalse(s.isPalindrome(10));
        assertFalse(s.isPalindrome(-121));
    }
}
