package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class RepeatedStringMatchTest {
    RepeatedStringMatch s = new RepeatedStringMatch();
    @Test
    public void test1(){
        assertEquals(3, s.repeatedStringMatch("abcd", "cdabcdab"));
        assertEquals(4, s.repeatedStringMatch("abc", "cabcabca"));
    }
}
