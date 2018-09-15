package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ReverseWord2Test {
    ReverseWord2 s = new ReverseWord2();
    @Test
    public void test1(){
        assertEquals("bacdfeg", s.reverseStr("abcdefg", 2));
    }
}
