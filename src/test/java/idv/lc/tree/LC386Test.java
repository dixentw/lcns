package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC386Test {
    LC386 s = new LC386();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(1);
        ro.left = new TreeNode(2);
        ro.right = new TreeNode(3);
        ro.left.left = new TreeNode(4);
        ro.left.right = new TreeNode(5);
        List<List<Integer>> res = s.findLeaves(ro);
        assertEquals("[4, 5, 3]", Arrays.toString(res.get(0).toArray()));
        assertEquals("[2]", Arrays.toString(res.get(1).toArray()));
        assertEquals("[1]", Arrays.toString(res.get(2).toArray()));
    }
}
