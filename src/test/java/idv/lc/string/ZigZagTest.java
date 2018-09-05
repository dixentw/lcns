package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ZigZagTest {
    ZigZag s = new ZigZag();
    @Test
    public void test1(){
        String res = s.convert("PAYPALISHIRING", 3);
        assertEquals("PAHNAPLSIIGYIR", res);
    }
    @Test
    public void test2(){
        String res = s.convert("PAYPALISHIRING", 4);
        assertEquals("PINALSIGYAHRPI", res);
    }
    @Test
    public void test3(){
        String res = s.convert("A", 1);
        assertEquals("A", res);
    }
}
