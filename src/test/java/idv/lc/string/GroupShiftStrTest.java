package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class GroupShiftStrTest {
    GroupShiftStr s = new GroupShiftStr();
    @Test
    public void test1(){
        String[] ins = new String[]{"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"};
        List<List<String>> res = s.groupStrings(ins);
        assertEquals(4, res.size());
        assertEquals("[abc, bcd, xyz]", Arrays.toString(res.get(0).toArray()));
        assertEquals("[a, z]", Arrays.toString(res.get(1).toArray()));
        assertEquals("[az, ba]", Arrays.toString(res.get(2).toArray()));
        assertEquals("[acef]", Arrays.toString(res.get(3).toArray()));
    }
}
