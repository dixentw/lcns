package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC872Test {
    LC872 s = new LC872();
    @Test
    public void test1(){
        TreeNode ro1 = new TreeNode(1);
        ro1.left = new TreeNode(2);
        ro1.right = new TreeNode(3);

        TreeNode ro2 = new TreeNode(5);
        ro2.left = new TreeNode(2);
        ro2.right = new TreeNode(3);

        assertTrue(s.leafSimilar(ro1, ro2));
    }
}
