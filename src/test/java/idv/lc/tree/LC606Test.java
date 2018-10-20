package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC606Test {
    LC606 s = new LC606();
    @Test
    public void test1(){
        TreeNode tr = new TreeNode(1);
        tr.left = new TreeNode(2);
        tr.right = new TreeNode(3);
        tr.left.left = new TreeNode(4);
        assertEquals("1(2(4))(3)", s.tree2str(tr));
    }
}
