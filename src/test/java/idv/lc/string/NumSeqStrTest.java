package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class NumSeqStrTest {
    NumSeqStr s = new NumSeqStr();
    @Test
    public void test1(){
        assertEquals(5, s.countSegments("Hello, my name is John"));
        assertEquals(5, s.countSegments("Hello, my name\tis John"));
        assertEquals(2, s.countSegments("    foo    bar"));
    }
}
