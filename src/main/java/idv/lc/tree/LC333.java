package idv.lc.tree;

import java.util.*;

public class LC333 {
    public int largestBSTSubtree(TreeNode root) {
        if (root == null) return 0;
        if (helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            return count(root);
        }
        int left = largestBSTSubtree(root.left);
        int right = largestBSTSubtree(root.right);
        return Math.max(left, right);
    }
    public boolean helper(TreeNode node, int min, int max) {
        if (node == null) return true;
        if (node.val <= min || node.val >= max) return false;
        return helper(node.left, min, node.val) && helper(node.right, node.val, max);
    }
    public int count(TreeNode node) {
        if (node == null) return 0;
        return 1 + count(node.left) + count(node.right);
    }
}
