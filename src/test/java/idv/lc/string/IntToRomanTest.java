package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class IntToRomanTest {
    IntToRoman s = new IntToRoman();
    @Test
    public void test1(){
        assertEquals("III", s.intToRoman(3));
        assertEquals("IV", s.intToRoman(4));
        assertEquals("IX", s.intToRoman(9));
        assertEquals("LVIII", s.intToRoman(58));
        assertEquals("MCMXCIV", s.intToRoman(1994));
    }
}
