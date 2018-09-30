package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class GetModifiedArrayTest {
    GetModifiedArray s = new GetModifiedArray();
    @Test
    public void test1(){
        int[] res = s.getModifiedArray(5, new int[][]{
            {1, 3, 2} , {2, 4, 3}, {0, 2, -2}
        });
        assertEquals("[-2, 0, 3, 5, 3]", Arrays.toString(res));
    }
}
