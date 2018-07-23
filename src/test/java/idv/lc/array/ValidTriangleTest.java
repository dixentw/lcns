package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ValidTriangleTest {
    ValidTriangle s = new ValidTriangle();
    @Test
    public void test1(){
        assertEquals(3, s.triangleNumber(new int[]{2,2,3,4}));
        assertEquals(7, s.triangleNumber(new int[]{1,2,3,4,5,6}));
    }
}
