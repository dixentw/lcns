package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC60Test {
    LC60 s = new LC60();
    @Test
    public void test1(){
        String res = s.getPermutation(3, 3);
        assertEquals("213", res);
    }
}
