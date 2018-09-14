package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ValidIPAddrTest {
    ValidIPAddr s = new ValidIPAddr();
    @Test
    public void test1(){
        assertEquals("IPv4",s.validIPAddress("172.16.254.1"));
        assertEquals("IPv6",s.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
        assertEquals("Neither",s.validIPAddress("256.256.256.256"));
    }
}
