package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class NextPermTest {
    NextPerm s = new NextPerm();
    @Test
    public void test1(){
        int[] arr = new int[]{1,2,3};
        s.nextPermutation(arr);
        assertEquals("[1, 3, 2]",Arrays.toString(arr));
        arr = new int[]{3,2,1};
        s.nextPermutation(arr);
        assertEquals("[1, 2, 3]",Arrays.toString(arr));
        arr = new int[]{1,1,5};
        s.nextPermutation(arr);
        assertEquals("[1, 5, 1]",Arrays.toString(arr));
        arr = new int[]{1,3,2};
        s.nextPermutation(arr);
        assertEquals("[2, 1, 3]",Arrays.toString(arr));
        arr = new int[]{2,3,1};
        s.nextPermutation(arr);
        assertEquals("[3, 1, 2]",Arrays.toString(arr));
    }
}
