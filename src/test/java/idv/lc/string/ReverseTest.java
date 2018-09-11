package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ReverseTest {
    Reverse s = new Reverse();
    @Test
    public void test1(){
        assertEquals("olleh", s.reverseString("hello"));
        assertEquals("amanaP :lanac a ,nalp a ,nam A", s.reverseString("A man, a plan, a canal: Panama"));
    }
}
