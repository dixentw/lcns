package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class RandomizedSetTest {
    RandomizedSet s = new RandomizedSet();
    @Test
    public void test1(){
        assertTrue(s.insert(1));
        assertFalse(s.remove(2));
        assertTrue(s.insert(2));
        s.getRandom();
    }
}
