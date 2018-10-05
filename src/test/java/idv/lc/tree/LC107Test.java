package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC107Test {
    LC107 s = new LC107();
    LC536 p = new LC536();
    @Test
    public void test1(){
        String tr = "3(9)(20(15)(7))";
        TreeNode ro = p.str2tree(tr);
        List<List<Integer>> res = s.levelOrderBottom(ro);
        assertEquals("[15, 7]", Arrays.toString(res.get(0).toArray()));
        assertEquals("[9, 20]", Arrays.toString(res.get(1).toArray()));
        assertEquals("[3]", Arrays.toString(res.get(2).toArray()));
    }
}
