package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ComplexNumMultiplyTest {
    ComplexNumMultiply s = new ComplexNumMultiply();
    @Test
    public void test1(){
        assertEquals("0+2i", s.complexNumberMultiply("1+1i", "1+1i"));
        assertEquals("0+-2i", s.complexNumberMultiply("1+-1i", "1+-1i"));
    }
}
