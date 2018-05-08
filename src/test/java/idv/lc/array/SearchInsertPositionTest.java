package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class SearchInsertPositionTest{
    SearchInsertPosition s = new SearchInsertPosition();
    @Test
    public void test1(){
        int[] arr = new int[]{1,3,5,6};
        assertEquals(1, s.searchInsert(arr, 2));
        arr = new int[]{1,3,5,6};
        assertEquals(4, s.searchInsert(arr, 7));
        arr = new int[]{1,3,5,6};
        assertEquals(0, s.searchInsert(arr, 0));
    }
}
