package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC535Test {
    LC535 s = new LC535();
    @Test
    public void test1(){
        String longu = "https://leetcode.com/problems/design-tinyurl";
        String shorten = s.encode(longu);
        assertEquals(longu, s.decode(shorten));
    }
}
