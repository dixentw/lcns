package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC247Test {
    LC247 s = new LC247();
    @Test
    public void test1(){
        List<String> res = s.findStrobogrammatic(2);
        assertEquals("11", res.get(0));
        assertEquals("69", res.get(1));
        assertEquals("96", res.get(2));
        assertEquals("88", res.get(3));
    }
}
