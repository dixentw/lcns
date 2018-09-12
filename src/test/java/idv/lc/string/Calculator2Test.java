package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class Calculator2Test {
    Calculator2 s = new Calculator2();
    @Test
    public void test1(){
        assertEquals(7, s.calculate("3+2*2"));
        assertEquals(1, s.calculate(" 3/2 "));
        assertEquals(5, s.calculate(" 3+5 / 2 "));
    }
}
