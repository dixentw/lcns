package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class FindAllDuplicatesTest {
    FindAllDuplicates s = new FindAllDuplicates();
    @Test
    public void test1(){
        int[] arr = new int[]{4,3,2,7,8,2,3,1};
        assertEquals("[2, 3]", Arrays.toString(s.findDuplicates(arr).toArray()));
    }
}
