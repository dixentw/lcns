package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class RomanToIntTest {
    RomanToInt s = new RomanToInt();
    @Test
    public void test1(){
        assertEquals(3, s.romanToInt("III"));
        assertEquals(4, s.romanToInt("IV"));
        assertEquals(9, s.romanToInt("IX"));
        assertEquals(58, s.romanToInt("LVIII"));
        assertEquals(1994, s.romanToInt("MCMXCIV"));
    }
}
