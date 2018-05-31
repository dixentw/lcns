package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MajorityElemTest {
    MajorityElem s = new MajorityElem();
    @Test
    public void test1(){
        assertEquals(3, s.majorityElement(new int[]{3,2,3}));
        assertEquals(2, s.majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}
