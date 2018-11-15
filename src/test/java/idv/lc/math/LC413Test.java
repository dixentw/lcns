package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC413Test {
    LC413 s = new LC413();
    @Test
    public void test1(){
        assertEquals(3,s.numberOfArithmeticSlices(new int[]{1,2,3,4}));
    }
}
