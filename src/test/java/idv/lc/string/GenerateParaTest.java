package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class GenerateParaTest {
    GeneratePara s = new GeneratePara();
    @Test
    public void test1(){
        List<String> res = s.generateParenthesis(3);
        assertEquals(5, res.size());
        assertEquals("((()))", res.get(0));
        assertEquals("(()())", res.get(1));
        assertEquals("(())()", res.get(2));
        assertEquals("()(())", res.get(3));
        assertEquals("()()()", res.get(4));
    }
}
