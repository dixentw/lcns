package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class RotatedDigitsTest {
    RotatedDigits s = new RotatedDigits();
    @Test
    public void test1(){
        assertEquals(4, s.rotatedDigits(10));
    }
}
