package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC202Test {
    LC202 s = new LC202();
    @Test
    public void test1(){
        assertTrue(s.isHappy(19));
    }
}
