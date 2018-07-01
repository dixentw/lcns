package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class FindDupTest {
    FindDup s = new FindDup();
    @Test
    public void test1(){
        assertEquals(2, s.findDuplicate(new int[]{1,3,4,2,2}));
        assertEquals(3, s.findDuplicate(new int[]{3,1,3,4,2}));
    }
}
