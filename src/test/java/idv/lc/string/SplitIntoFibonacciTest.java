package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class SplitIntoFibonacciTest {
    SplitIntoFibonacci s = new SplitIntoFibonacci();
    @Test
    public void test1(){
        List<Integer> res = s.splitIntoFibonacci("123456579");
        assertEquals(3, res.size());
        assertEquals(new Integer(123), res.get(0));
        assertEquals(new Integer(456), res.get(1));
        assertEquals(new Integer(579), res.get(2));
    }
}
