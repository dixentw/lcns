package idv.lc.tree;

import java.util.*;

public class LC543 {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int[] max = new int[1];
        helper(root, max);
        return max[0];
    }
    public int helper(TreeNode node, int[] max) {
        if (node == null) return 0;
        int leftDepth = helper(node.left, max);
        int rightDepth = helper(node.right, max);
        max[0] = Math.max(max[0], leftDepth+rightDepth);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
