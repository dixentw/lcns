package idv.lc.hash;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC811Test {
    LC811 s = new LC811();
    @Test
    public void test1(){
        List<String> res = s.subdomainVisits(new String[]{"9001 discuss.leetcode.com"});
        assertEquals(3, res.size());
        assertEquals("9001 com", res.get(0));
        assertEquals("9001 leetcode.com", res.get(1));
        assertEquals("9001 discuss.leetcode.com", res.get(2));
    }
    @Test
    public void test2(){
        List<String> res = s.subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"});
        assertEquals(7, res.size());
        assertEquals("951 com", res.get(0));
        assertEquals("900 google.mail.com", res.get(1));
        assertEquals("1 intel.mail.com", res.get(2));
        assertEquals("5 org", res.get(3));
        assertEquals("5 wiki.org", res.get(4));
        assertEquals("901 mail.com", res.get(5));
        assertEquals("50 yahoo.com", res.get(6));
    }
}
