package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class CheckValidStringTest {
    CheckValidString s = new CheckValidString();
    @Test
    public void test1(){
        assertTrue(s.checkValidString(""));
        assertTrue(s.checkValidString("()"));
        assertTrue(s.checkValidString("(*)"));
        assertTrue(s.checkValidString("(*))"));
        assertFalse(s.checkValidString("(*)))"));
        assertTrue(s.checkValidString("(((******))"));
        assertFalse(s.checkValidString("(())((())()()(*)(*()(())())())()()((()())((()))(*"));
    }
}
