package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MissingNumTest {
    MissingNum s = new MissingNum();
    @Test
    public void test1(){
        assertEquals(2, s.missingNumber(new int[]{1,0,3}));
        assertEquals(8, s.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}
