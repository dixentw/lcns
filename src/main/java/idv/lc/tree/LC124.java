package idv.lc.tree;

import java.util.*;

public class LC124 {
    public int maxPathSum(TreeNode root) {
        int[] max = new int[1];
        max[0] = Integer.MIN_VALUE;
        helper(root, max);
        return max[0];
    }
    public int helper(TreeNode root, int[] max) {
        if (root == null) return 0;
        int left = Math.max(0, helper(root.left, max));// discard child if small then zero
        int right = Math.max(0, helper(root.right, max));
        int center = left+right+root.val;
        max[0] = Math.max(max[0], center);
        return Math.max(left, right) + root.val;
    }
}
