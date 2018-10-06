package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC113Test {
    LC113 s = new LC113();
    LC536 p = new LC536();
    @Test
    public void test1(){
        String tr = "5(4(11(7)(2)))(8(13)(4(5)(1)))";
        TreeNode ro = p.str2tree(tr);
        List<List<Integer>> res = s.pathSum(ro, 22);
        assertEquals("[5, 4, 11, 2]", Arrays.toString(res.get(0).toArray()));
        assertEquals("[5, 8, 4, 5]", Arrays.toString(res.get(1).toArray()));
    }
}
