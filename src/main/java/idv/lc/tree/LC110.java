package idv.lc.tree;

import java.util.*;

public class LC110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int left = helper(root.left);
        int right = helper(root.right);
        return Math.abs(left-right) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    public int helper(TreeNode node) {
        if (node == null) return 0;
        int maxLv = Math.max(helper(node.left), helper(node.right));
        return maxLv+1;
    }
}
