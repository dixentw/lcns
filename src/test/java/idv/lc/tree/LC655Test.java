package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC655Test {
    LC655 s = new LC655();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(1);
        ro.left = new TreeNode(2);
        List<List<String>> res = s.printTree(ro);
        assertEquals("[, 1, ]", Arrays.toString(res.get(0).toArray()));
        assertEquals("[2, , ]", Arrays.toString(res.get(1).toArray()));
    }
}
