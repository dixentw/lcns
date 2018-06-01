package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class FindDisapearedNumTest {
    FindDisapearedNum s = new FindDisapearedNum();
    @Test
    public void test1(){
        List<Integer> res = s.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
        assertEquals("[5, 6]", Arrays.toString(res.toArray()));
    }
}
