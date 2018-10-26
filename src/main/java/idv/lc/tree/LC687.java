package idv.lc.tree;

import java.util.*;

public class LC687 {
    public int longestUnivaluePath(TreeNode root) {
        int[] max =  new int[1];
        if (root == null) return 0;
        helper(root, max);
        return max[0];
    }
    public int helper(TreeNode root, int[] max) {
        int left = (root.left == null) ? 0 : helper(root.left, max);
        int right = (root.right == null) ? 0 : helper(root.right, max);
        int acrossL = 0;
        if (root.left != null && root.left.val == root.val) {
            acrossL = left + 1;
        }
        int acrossR = 0;
        if (root.right != null && root.right.val == root.val) {
            acrossR = right + 1;
        }
        int pathAccross = acrossL + acrossR;
        max[0] = Math.max(max[0], pathAccross);
        // this value combine with straight result.
        return pathAccross;
    }
}
