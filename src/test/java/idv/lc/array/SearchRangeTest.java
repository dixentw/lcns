package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class SearchRangeTest {
    SearchRange s = new SearchRange();
    @Test
    public void test1(){
        assertEquals("[3, 4]", Arrays.toString(s.searchRange(new int[]{5,7,7,8,8,10}, 8)));
        assertEquals("[-1, -1]", Arrays.toString(s.searchRange(new int[]{5,7,7,8,8,10}, 6)));
        assertEquals("[0, 0]", Arrays.toString(s.searchRange(new int[]{1}, 1)));
        assertEquals("[-1, -1]", Arrays.toString(s.searchRange(new int[]{1}, 2)));
    }
}
