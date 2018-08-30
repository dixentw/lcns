package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class TriangleTest {
    Triangle s = new Triangle();
    @Test
    public void test1(){
        List<List<Integer>> tri = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        one.add(2);
        List<Integer> two = new ArrayList<>();
        two.add(3);
        two.add(4);
        List<Integer> three = new ArrayList<>();
        three.add(6);
        three.add(5);
        three.add(7);
        List<Integer> four = new ArrayList<>();
        four.add(4);
        four.add(1);
        four.add(8);
        four.add(3);
        tri.add(one);
        tri.add(two);
        tri.add(three);
        tri.add(four);
        assertEquals(11, s.minimumTotal(tri));
    }
}
