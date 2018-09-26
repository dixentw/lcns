package idv.lc.misc;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ArrangeTest {
    Arrange s = new Arrange();
    @Test
    public void test1(){
        assertEquals(7, s.getMinArrange(5, 2, 8));
    }
}
