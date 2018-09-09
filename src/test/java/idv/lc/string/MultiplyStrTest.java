package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MultiplyStrTest {
    MultiplyStr s = new MultiplyStr();
    @Test
    public void test1(){
        assertEquals("6", s.multiply("3", "2"));
        assertEquals("245", s.multiply("35", "7"));
        assertEquals("56088", s.multiply("123", "456"));
        assertEquals("0", s.multiply("9999", "0"));
    }
}
