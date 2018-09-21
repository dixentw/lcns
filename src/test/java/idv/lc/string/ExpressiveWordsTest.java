package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ExpressiveWordsTest {
    ExpressiveWords s = new ExpressiveWords();
    @Test
    public void test1(){
        assertEquals(1, s.expressiveWords("heeellooo", new String[]{"hello", "hi", "helo"}));
    }
}
