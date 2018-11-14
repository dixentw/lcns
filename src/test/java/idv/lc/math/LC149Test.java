package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC149Test {
    LC149 s = new LC149();
    @Test
    public void test1(){
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);
        Point p3 = new Point(3, 3);
        Point[] ap = new Point[]{p1, p2, p3};
        assertEquals(3, s.maxPoints(ap));
    }
}
