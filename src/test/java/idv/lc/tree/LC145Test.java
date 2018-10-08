package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC145Test {
    LC145 s = new LC145();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(1);
        ro.right = new TreeNode(2);
        ro.right.left = new TreeNode(3);
        List<Integer> res = s.postorderTraversal(ro);
        assertEquals("[3, 2, 1]", Arrays.toString(res.toArray()));
    }
}
