package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LongestUSLen2Test {
    LongestUSLen2 s = new LongestUSLen2();
    @Test
    public void test1(){
        assertEquals(3, s.findLUSlength(new String[]{"aba", "cdc", "eae"}));
    }
}
