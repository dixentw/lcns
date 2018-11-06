package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC223Test {
    LC223 s = new LC223();
    @Test
    public void test1(){
        assertEquals(45, s.computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
    }
}
