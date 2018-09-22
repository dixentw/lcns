package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class AmbiguousCoordinatesTest {
    AmbiguousCoordinates s = new AmbiguousCoordinates();
    @Test
    public void test1(){
        List<String> res = s.ambiguousCoordinates("(123)");
        assertEquals("(1, 23)", res.get(0));
        assertEquals("(1, 2.3)", res.get(1));
        assertEquals("(12, 3)", res.get(2));
        assertEquals("(1.2, 3)", res.get(3));
    }
}
