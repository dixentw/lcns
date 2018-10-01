package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MaxDistanceTest {
    MaxDistance s = new MaxDistance();
    @Test
    public void test1(){
        List<List<Integer>> arrs = new ArrayList<>();
        arrs.add(Arrays.asList(new Integer[]{1,2,3}));
        arrs.add(Arrays.asList(new Integer[]{4,5}));
        arrs.add(Arrays.asList(new Integer[]{1,2,3}));
        assertEquals(4, s.maxDistance(arrs));
    }
    @Test
    public void test2(){
        List<List<Integer>> arrs = new ArrayList<>();
        arrs.add(Arrays.asList(new Integer[]{1,4}));
        arrs.add(Arrays.asList(new Integer[]{0,5}));
        assertEquals(4, s.maxDistance(arrs));
    }
}
