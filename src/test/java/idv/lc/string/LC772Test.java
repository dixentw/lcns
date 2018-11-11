package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC772Test {
    LC772 s = new LC772();
    @Test
    public void test1(){
        assertEquals(2, s.calculate("1+1"));
        assertEquals(4, s.calculate("6-4 / 2"));
        assertEquals(-12, s.calculate("(2+6* 3+5- (3*14/7+2)*5)+3"));
    }
}
