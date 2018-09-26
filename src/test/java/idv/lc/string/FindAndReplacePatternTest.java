package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class FindAndReplacePatternTest {
    FindAndReplacePattern s = new FindAndReplacePattern();
    @Test
    public void test1(){
        List<String> res = s.findAndReplacePattern(new String[]{"abc","deq","mee","aqq","dkd","ccc"}, "abb");
        assertEquals("mee", res.get(0));
        assertEquals("aqq", res.get(1));
    }
}
