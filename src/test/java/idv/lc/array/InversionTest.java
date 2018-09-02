package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class InversionTest {
    Inversion s = new Inversion();
    @Test
    public void test1(){
        assertTrue(s.isIdealPermutation(new int[]{1,0,2}));
        assertFalse(s.isIdealPermutation(new int[]{1, 2, 0}));
    }
}
