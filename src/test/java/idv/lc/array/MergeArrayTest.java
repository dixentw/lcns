package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MergeArrayTest {
    MergeArray s = new MergeArray();
    @Test
    public void test1(){
        int[] arr = new int[]{1,2,3,0,0,0};
        int[] arr2 = new int[]{2,5,6};
        s.merge(arr, 3, arr2, 3);
        assertEquals("[1, 2, 2, 3, 5, 6]", Arrays.toString(arr));
    }
}
