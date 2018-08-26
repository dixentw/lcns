package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class PascalTriangle2Test {
    PascalTriangle2 s = new PascalTriangle2();
    @Test
    public void test1(){
        List<Integer> res = s.getRow(3);
        assertEquals("[1, 3, 3, 1]", Arrays.toString(res.toArray()));
    }
}
