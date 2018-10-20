package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC582Test {
    LC582 s = new LC582();
    @Test
    public void test1(){
        Integer[] pid = new Integer[]{1, 3, 10, 5};
        Integer[] ppid = new Integer[]{3, 0, 5, 3};
        List<Integer> res = s.killProcess(Arrays.asList(pid), Arrays.asList(ppid), 5);
        assertEquals("[5, 10]" , Arrays.toString(res.toArray()));
    }
}
