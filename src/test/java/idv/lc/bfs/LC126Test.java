package idv.lc.bfs;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC126Test {
    LC126 s = new LC126();
    @Test
    public void test0(){
        List<String> wl = new ArrayList<>();
        wl.add("hot");
        wl.add("dot");
        wl.add("dog");
        wl.add("lot");
        wl.add("log");
        List<List<String>> res = s.findLadders("hit", "cog", wl);
        assertEquals(0, res.size());
    }
    @Test
    public void test1(){
        List<String> wl = new ArrayList<>();
        wl.add("hot");
        wl.add("dot");
        wl.add("dog");
        wl.add("lot");
        wl.add("log");
        wl.add("cog");
        List<List<String>> res = s.findLadders("hit", "cog", wl);
        assertEquals(2, res.size());
    }
}
