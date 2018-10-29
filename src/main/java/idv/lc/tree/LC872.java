package idv.lc.tree;

import java.util.*;

public class LC872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        helper(root1, l1);
        helper(root2, l2);
        return Arrays.toString(l1.toArray()).equals(Arrays.toString(l2.toArray()));
    }
    public void helper(TreeNode root, List<Integer> leaves) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            leaves.add(root.val);
            return;
        }
        helper(root.left, leaves);
        helper(root.right, leaves);
    }
}
