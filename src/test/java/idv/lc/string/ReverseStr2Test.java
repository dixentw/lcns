package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ReverseStr2Test {
    ReverseStr2 s = new ReverseStr2();
    @Test
    public void test1(){
        char[] str = new char[]{'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
        s.reverseWords(str);
        assertEquals("[b, l, u, e,  , i, s,  , s, k, y,  , t, h, e]", Arrays.toString(str));
    }
}
