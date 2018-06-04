package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ContainDupsTest {
    ContainDups s = new ContainDups();
    @Test
    public void test1(){
        assertTrue(s.containsDuplicate(new int[]{1,2,3,1}));
        assertFalse(s.containsDuplicate(new int[]{1,2,3,4}));
        assertTrue(s.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
}
