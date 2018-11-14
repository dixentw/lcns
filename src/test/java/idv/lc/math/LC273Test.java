package idv.lc.math;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC273Test {
    LC273 s = new LC273();
    @Test
    public void test1(){
       assertEquals("One Hundred Twenty Three", s.numberToWords(123)) ;
       assertEquals("Twenty", s.numberToWords(20)) ;
       assertEquals("Twelve Thousand Three Hundred Forty Five", s.numberToWords(12345)) ;
    }
}
