package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MaskPIITest {
    MaskPII s = new MaskPII();
    @Test
    public void test1(){
        assertEquals("l*****e@leetcode.com", s.maskPII("LeetCode@LeetCode.com"));
        assertEquals("a*****b@qq.com", s.maskPII("AB@qq.com"));
        assertEquals("***-***-7890", s.maskPII("1(234)567-890"));
        assertEquals("+**-***-***-5678", s.maskPII("86-(10)12345678"));
    }
}
