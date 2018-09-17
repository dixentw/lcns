package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class FindDuplicateTest {
    FindDuplicate s = new FindDuplicate();
    @Test
    public void test1(){
        List<List<String>> res = s.findDuplicate(new String[]{"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"});
        assertEquals(2, res.size());
        assertEquals("[root/a/2.txt, root/c/d/4.txt, root/4.txt]", Arrays.toString(res.get(0).toArray()));
        assertEquals("[root/a/1.txt, root/c/3.txt]", Arrays.toString(res.get(1).toArray()));
    }
}
