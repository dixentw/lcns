package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC314Test {
    LC314 s = new LC314();
    @Test
    public void test1(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> res = s.verticalOrder(root);
        assertEquals(4, res.size());
    }
    @Test
    public void test2(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(0);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(7);
        root.left.right.left = new TreeNode(5);
        root.left.right.right = new TreeNode(2);
        List<List<Integer>> res = s.verticalOrder(root);
        assertEquals(5, res.size());
    }
}
