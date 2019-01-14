package idv.lc.dp;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC974Test {
    LC974 s = new LC974();
    @Test
    public void test1(){
        assertEquals(7, s.subarraysDivByK(new int[]{4,5,0,-2,-3,1}, 5));
    }
}
