package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class FindPeakElemTest {
    FindPeakElem s = new FindPeakElem();
    @Test
    public void test1(){
        assertEquals(2, s.findPeakElement(new int[]{1,2,3,1}));
        assertEquals(5, s.findPeakElement(new int[]{1,2,1,3,5,6,4}));
    }
}
