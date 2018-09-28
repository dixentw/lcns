package idv.lc.misc;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ArrangeTest {
    Arrange s = new Arrange();
    @Test
    public void test1(){
        assertEquals(7, s.getMinArrange(5, 2, 8));
        assertEquals(18, s.getMinArrange(3, 5, 14));
        assertEquals(0, s.getMinArrange(1, 16, 1));
        assertEquals(10, s.getMinArrange(8, 2, 12));
        assertEquals(0, s.getMinArrange(15, 1, 6));
        assertEquals(3, s.getMinArrange(3, 3, 6));

        assertEquals(18, s.getMinArrange(5,3,14));
        assertEquals(2, s.getMinArrange(4,3,7));
        assertEquals(0, s.getMinArrange(6,2,4));
        assertEquals(0, s.getMinArrange(3,5,1));
        assertEquals(16, s.getMinArrange(6,2,12));
    }
}
