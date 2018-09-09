package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class DivideTwoIntTest {
    DivideTwoInt s = new DivideTwoInt();
    @Test
    public void test1(){
        assertEquals(3, s.divide(10, 3));
        assertEquals(3, s.divide(9, 3));
        assertEquals(3, s.divide(11, 3));
        assertEquals(4, s.divide(12, 3));
        assertEquals(-2, s.divide(7, -3));
        assertEquals(1, s.divide(-1, -1));
        assertEquals(2147483647, s.divide(-2147483648, -1));
        assertEquals(2147483647, s.divide(2147483647, 1));
        assertEquals(1073741823, s.divide(2147483647, 2));
    }
}
