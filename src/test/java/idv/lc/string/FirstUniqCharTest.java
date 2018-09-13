package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class FirstUniqCharTest {
    FirstUniqChar s = new FirstUniqChar();
    @Test
    public void test1(){
        assertEquals(0, s.firstUniqChar("leetcode"));
        assertEquals(2, s.firstUniqChar("loveleetcode"));
        assertEquals(-1, s.firstUniqChar("cc"));
    }
}
