package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC396Test {
    LC396 s = new LC396();
    @Test
    public void test1(){
       assertEquals(26, s.maxRotateFunction(new int[]{4,3,2,6}));
    }
}
