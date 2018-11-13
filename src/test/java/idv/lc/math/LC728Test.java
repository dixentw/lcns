package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC728Test {
    LC728 s = new LC728();
    @Test
    public void test1(){
        List<Integer> res = s.selfDividingNumbers(1, 22);
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]", Arrays.toString(res.toArray()));
    }
}
