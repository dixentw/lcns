package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ReverseVowelTest {
    ReverseVowel s = new ReverseVowel();
    @Test
    public void test1(){
        assertEquals("holle", s.reverseVowels("hello"));
        assertEquals("leotcede", s.reverseVowels("leetcode"));
        assertEquals("Aa", s.reverseVowels("aA"));
    }
}
