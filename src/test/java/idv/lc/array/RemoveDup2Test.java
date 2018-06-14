package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class RemoveDup2Test {
    RemoveDup2 s = new RemoveDup2();
    @Test
    public void test1(){
        int[] arr = new int[]{1,1,1,2,2,3};
        int res = s.removeDuplicates(arr);
        assertEquals(5, res);
        arr = new int[]{0,0,1,1,1,1,2,3,3};
        res = s.removeDuplicates(arr);
        assertEquals(7, res);

    }
}
