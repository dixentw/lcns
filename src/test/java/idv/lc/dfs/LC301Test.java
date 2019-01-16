package idv.lc.dfs;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC301Test {
    LC301 s = new LC301();
    @Test
    public void test1(){
        List<String> res = s.removeInvalidParentheses("()())()");
        assertEquals("()()()", res.get(0));
        assertEquals("(())()", res.get(1));
    }
}
