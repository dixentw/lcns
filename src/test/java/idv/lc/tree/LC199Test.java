package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC199Test {
    LC199 s = new LC199();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(1);
        ro.left = new TreeNode(2);
        ro.right = new TreeNode(3);
        ro.left.right = new TreeNode(5);
        ro.right.right = new TreeNode(4);
        List<Integer> res = s.rightSideView(ro);
        assertEquals("[1, 3, 4]", Arrays.toString(res.toArray()));
    }
}
