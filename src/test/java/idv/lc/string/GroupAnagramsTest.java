package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class GroupAnagramsTest {
    GroupAnagrams s = new GroupAnagrams();
    @Test
    public void test1(){
        List<List<String>> res = s.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        assertEquals("[eat, tea, ate]", Arrays.toString(res.get(0).toArray()));
        assertEquals("[bat]", Arrays.toString(res.get(1).toArray()));
        assertEquals("[tan, nat]", Arrays.toString(res.get(2).toArray()));
    }
}
