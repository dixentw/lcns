package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC257Test {
    LC257 s = new LC257();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(1);
        ro.left = new TreeNode(2);
        ro.right = new TreeNode(3);
        ro.left.right = new TreeNode(5);
        List<String> paths = s.binaryTreePaths(ro);
        assertEquals("1->2->5", paths.get(0));
        assertEquals("1->3", paths.get(1));
    }
}
