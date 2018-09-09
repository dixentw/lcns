package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class AddBinaryTest {
    AddBinary s = new AddBinary();
    @Test
    public void test1(){
        assertEquals("100", s.addBinary("11", "1"));
        assertEquals("10101", s.addBinary("1010", "1011"));
        assertEquals("11110", s.addBinary("1111", "1111"));
    }
}
