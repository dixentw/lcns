package idv.lc.stack;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC682Test {
    LC682 s = new LC682();
    @Test
    public void test1(){
        assertEquals(30, s.calPoints(new String[]{"5","2","C","D","+"}));
        assertEquals(27, s.calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));
    }
}
