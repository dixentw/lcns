package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class FindReplaceStringTest {
    FindReplaceString s = new FindReplaceString();
    @Test
    public void test1(){
        String res = s.findReplaceString("abcd", new int[]{0, 2},
                new String[]{"a", "cd"}, new String[]{"eee", "ffff"});
        assertEquals("eeebffff", res);
        res = s.findReplaceString("abcd", new int[]{0, 2},
                new String[]{"ab", "ec"}, new String[]{"eee", "ffff"});
        assertEquals("eeecd", res);
        res = s.findReplaceString("vmokgggqzp", new int[]{3,5,1},
                new String[]{"kg", "ggq", "mo"}, new String[]{"s", "so", "bfr"});
        assertEquals("vbfrssozp", res);
    }
}
