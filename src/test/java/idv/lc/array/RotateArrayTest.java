package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class RotateArrayTest {
    RotateArray s = new RotateArray();
    @Test
    public void test1(){
        int[] arr = new int[]{1,2,3,4,5,6,7};
        s.rotate(arr, 3);
        assertEquals("[5, 6, 7, 1, 2, 3, 4]", Arrays.toString(arr));
    }
}
