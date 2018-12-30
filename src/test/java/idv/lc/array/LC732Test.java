package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC732Test {
    LC732 s = new LC732();
    @Test
    public void test1(){
        assertEquals(1, s.book(10, 20));
        assertEquals(1, s.book(50, 60));
        assertEquals(2, s.book(10, 40));
        assertEquals(3, s.book(5, 15));
        assertEquals(3, s.book(5, 10));
        assertEquals(3, s.book(25, 55));
    }
}
