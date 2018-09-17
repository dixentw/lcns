package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class NextGreaterElementTest {
    NextGreaterElement s = new NextGreaterElement();
    @Test
    public void test1(){
        assertEquals(21, s.nextGreaterElement(12));
        assertEquals(-1, s.nextGreaterElement(21));
        assertEquals(13222344, s.nextGreaterElement(12443322));
    }
}
