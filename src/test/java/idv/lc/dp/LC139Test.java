package idv.lc.dp;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC139Test {
    LC139 s = new LC139();
    @Test
    public void test1(){
        List<String> words = new ArrayList<>();
        words.add("leet");
        words.add("code");
        assertTrue(s.wordBreak("leetcode", words));
    }
}
