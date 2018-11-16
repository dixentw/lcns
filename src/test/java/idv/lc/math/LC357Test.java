package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC357Test {
    LC357 s = new LC357();
    @Test
    public void test1(){
        assertEquals(91,s.countNumbersWithUniqueDigits(2));
    }
}
