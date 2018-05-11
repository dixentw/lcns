package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class RemoveElementTest {
    RemoveElement s = new RemoveElement();
    @Test
    public void test1(){
        int[] arr = new int[]{3,2,2,3};
        int len = s.removeElement(arr, 3);
        assertEquals(2, len);
        assertEquals("[2, 2, 2, 3]", Arrays.toString(arr));
        arr = new int[]{0,1,2,2,3,0,4,2};
        len = s.removeElement(arr, 2);
        assertEquals(5, len);
        assertEquals("[0, 1, 3, 0, 4, 0, 4, 2]", Arrays.toString(arr));

    }
}
