package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC438Test {
    LC438 s = new LC438();
    @Test
    public void test1(){
        List<Integer> l = s.findAnagrams("cbaebabacd", "abc");
        assertEquals("[0, 6]", Arrays.toString(l.toArray()));
    }
    @Test
    public void test2(){
        List<Integer> l = s.findAnagrams("abab", "ab");
        assertEquals("[0, 1, 2]", Arrays.toString(l.toArray()));
    }
}
