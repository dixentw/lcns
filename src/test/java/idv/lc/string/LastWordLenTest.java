package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LastWordLenTest {
    LastWordLen s = new LastWordLen();
    @Test
    public void test1(){
        assertEquals(0, s.lengthOfLastWord(""));
        assertEquals(3, s.lengthOfLastWord(" abs"));
        assertEquals(3, s.lengthOfLastWord("abs "));
        assertEquals(3, s.lengthOfLastWord("abs"));
        assertEquals(5, s.lengthOfLastWord(" world"));
        assertEquals(5, s.lengthOfLastWord("hello world"));
        assertEquals(5, s.lengthOfLastWord("hello  world"));
    }
}
