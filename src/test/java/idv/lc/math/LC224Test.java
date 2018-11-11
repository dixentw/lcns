package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC224Test {
    LC224 s = new LC224();
    @Test
    public void test1(){
        assertEquals(23, s.calculateClassic("(1+(4+5+2)-3)+(6+8)"));
        assertEquals(3, s.calculateClassic(" 2-1 + 2 "));
    }
}
