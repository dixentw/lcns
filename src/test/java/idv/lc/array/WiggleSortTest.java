package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class WiggleSortTest {
    WiggleSort s = new WiggleSort();
    @Test
    public void test1(){
        int[] arr = new int[]{3,5,2,1,6,4};
        s.wiggleSort(arr);
        assertEquals("[3, 5, 1, 6, 2, 4]", Arrays.toString(arr));
    }
}
