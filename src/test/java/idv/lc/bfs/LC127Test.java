package idv.lc.bfs;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC127Test {
    LC127 s = new LC127();
    @Test
    public void test1(){
        List<String> wl = new ArrayList<>();
        wl.add("hot");
        wl.add("dot");
        wl.add("dog");
        wl.add("lot");
        wl.add("log");
        assertEquals(0, s.ladderLength("hit", "cog", wl));
    }
    @Test
    public void test2(){
        List<String> wl = new ArrayList<>();
        wl.add("hot");
        wl.add("dot");
        wl.add("dog");
        wl.add("lot");
        wl.add("log");
        wl.add("cog");
        assertEquals(5, s.ladderLength("hit", "cog", wl));
    }
}
