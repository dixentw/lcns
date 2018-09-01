package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class BeautifulArrTest {
    BeautifulArr s = new BeautifulArr();
    @Test
    public void test1(){
        assertEquals(2, s.countArrangement(2));
        assertEquals(3, s.countArrangement(3));
    }
}
