package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class StrstrTest {
    Strstr s = new Strstr();
    @Test
    public void test1(){
        assertEquals(-1, s.strStr("aaaaa", "bb"));
        assertEquals(2, s.strStr("hello", "ll"));
    }
}
