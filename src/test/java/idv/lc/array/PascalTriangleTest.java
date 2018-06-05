package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class PascalTriangleTest {
    PascalTriangle s = new PascalTriangle();
    @Test
    public void test1(){
        List<List<Integer>> res = s.generate(5);
        assertEquals("[1]", Arrays.toString(res.get(0).toArray()));
        assertEquals("[1, 1]", Arrays.toString(res.get(1).toArray()));
        assertEquals("[1, 2, 1]", Arrays.toString(res.get(2).toArray()));
        assertEquals("[1, 3, 3, 1]", Arrays.toString(res.get(3).toArray()));
        assertEquals("[1, 4, 6, 4, 1]", Arrays.toString(res.get(4).toArray()));
    }
}
