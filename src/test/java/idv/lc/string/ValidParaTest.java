package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ValidParaTest {
    ValidPara s = new ValidPara();
    @Test
    public void test1(){
        assertTrue(s.isValid("()"));
        assertTrue(s.isValid("()[]{}"));
        assertFalse(s.isValid("(]"));
        assertFalse(s.isValid("]"));
        assertFalse(s.isValid("([)]"));
        assertTrue(s.isValid("{[]}"));
    }
}
