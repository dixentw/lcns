package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class NonDecreaseArrTest {
    NonDecreaseArr s = new NonDecreaseArr();
    @Test
    public void test1(){
        assertFalse(s.checkPossibility(new int[]{3,4,2,3}));
    }
}
