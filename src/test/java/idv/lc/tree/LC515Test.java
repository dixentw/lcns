package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC515Test {
    LC515 s = new LC515();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(1);
        ro.left = new TreeNode(3);
        ro.right = new TreeNode(2);
        ro.left.left = new TreeNode(5);
        ro.left.right = new TreeNode(3);
        ro.right.right = new TreeNode(9);
        List<Integer> res = s.largestValues(ro);
        assertEquals("[1, 3, 9]", Arrays.toString(res.toArray()));
    }
}
