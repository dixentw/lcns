package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ToLowerCaseTest {
    ToLowerCase s = new ToLowerCase();
    @Test
    public void test1(){
        assertEquals("hello", s.toLowerCase("Hello"));
        assertEquals("here", s.toLowerCase("here"));
        assertEquals("lovely", s.toLowerCase("LOVELY"));
    }
}
