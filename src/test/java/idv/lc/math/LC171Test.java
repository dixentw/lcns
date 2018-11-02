package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC171Test {
    LC171 s = new LC171();
    @Test
    public void test1(){
        assertEquals(26, s.titleToNumber("Z"));
        assertEquals(27, s.titleToNumber("AA"));
        assertEquals(28, s.titleToNumber("AB"));
    }
}
