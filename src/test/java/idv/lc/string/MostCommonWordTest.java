package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MostCommonWordTest {
    MostCommonWord s = new MostCommonWord();
    @Test
    public void test1(){
        assertEquals("ball",
                s.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}));
        assertEquals("a",
                s.mostCommonWord("a.", new String[]{}));
    }
}
