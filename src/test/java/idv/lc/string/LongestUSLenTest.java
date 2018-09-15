package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LongestUSLenTest {
    LongestUSLen s = new LongestUSLen();
    @Test
    public void test1(){
        assertEquals(3, s.findLUSlength("aba", "cdc"));
        assertEquals(4, s.findLUSlength("abae", "cdce"));
    }
}
