package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class SimplifyPathTest {
    SimplifyPath s = new SimplifyPath();
    @Test
    public void test1(){
        assertEquals("/home", s.simplifyPath("/home/"));
        assertEquals("/c", s.simplifyPath("/a/./b/../../c/"));
    }
}
