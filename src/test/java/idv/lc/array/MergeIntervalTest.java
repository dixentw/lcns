package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MergeIntervalTest {
    MergeInterval s = new MergeInterval();
    @Test
    public void test1(){
        List<Interval> toMerge = new ArrayList<>();
        toMerge.add(new Interval(1,3));
        toMerge.add(new Interval(2,6));
        toMerge.add(new Interval(8,10));
        toMerge.add(new Interval(15,18));
        List<Interval> res = s.merge(toMerge);
        assertEquals("1,6", res.get(0).toString());
        assertEquals("8,10", res.get(1).toString());
        assertEquals("15,18", res.get(2).toString());
    }
    @Test
    public void test2(){
        List<Interval> toMerge = new ArrayList<>();
        toMerge.add(new Interval(1,4));
        toMerge.add(new Interval(4,5));
        List<Interval> res = s.merge(toMerge);
        assertEquals("1,5", res.get(0).toString());
    }
    @Test
    public void test3(){
        List<Interval> toMerge = new ArrayList<>();
        toMerge.add(new Interval(1,4));
        toMerge.add(new Interval(2,3));
        List<Interval> res = s.merge(toMerge);
        assertEquals("1,4", res.get(0).toString());
        assertEquals(1, res.size());
    }
    @Test
    public void test4(){
        List<Interval> toMerge = new ArrayList<>();
        toMerge.add(new Interval(1,4));
        toMerge.add(new Interval(1,4));
        List<Interval> res = s.merge(toMerge);
        assertEquals("1,4", res.get(0).toString());
        assertEquals(1, res.size());
    }
}
