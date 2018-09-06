package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LongestPrefixTest {
    LongestPrefix s = new LongestPrefix();
    @Test
    public void test1(){
        assertEquals("fl", s.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}
