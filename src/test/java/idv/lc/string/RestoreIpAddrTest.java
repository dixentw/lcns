package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class RestoreIpAddrTest {
    RestoreIpAddr s = new RestoreIpAddr();
    @Test
    public void test1(){
        List<String> res = s.restoreIpAddresses("25525511135");
        assertEquals("255.255.11.135", res.get(0));
        assertEquals("255.255.111.35", res.get(1));
        res = s.restoreIpAddresses("010010");
        for (String s : res) {
            System.out.println(s);
        }
    }
}
