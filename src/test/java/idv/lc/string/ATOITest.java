package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ATOITest {
    ATOI s = new ATOI();
    @Test
    public void test1(){
        assertEquals(42, s.myAtoi("42"));
        assertEquals(-42, s.myAtoi("-42"));
        assertEquals(4193, s.myAtoi("4193 with words"));
        assertEquals(0, s.myAtoi("words and 987"));
        assertEquals(-2147483648, s.myAtoi("-91283472332"));
        assertEquals(1, s.myAtoi("+1"));
        assertEquals(0, s.myAtoi("+-2"));
        assertEquals(0, s.myAtoi(" "));
        assertEquals(2147483647, s.myAtoi("2147483648"));
    }
}
