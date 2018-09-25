package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ShiftingLettersTest {
    ShiftingLetters s = new ShiftingLetters();
    @Test
    public void test1(){
        assertEquals("rpl", s.shiftingLetters("abc", new int[]{3,5,9}));
        assertEquals("jyh", s.shiftingLetters("bad", new int[]{10, 20, 30}));
    }
}
