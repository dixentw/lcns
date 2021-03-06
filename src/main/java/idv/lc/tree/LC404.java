package idv.lc.tree;

import java.util.*;

public class LC404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        int[] sum = new int[1];
        helper(root, false, sum);
        return sum[0];
    }
    public void helper(TreeNode root, boolean isLeft, int[] sum) {
        if (root == null) return;
        if (root.left == null && root.right == null && isLeft) {
            sum[0] += root.val;
            return;
        }
        helper(root.left, true, sum);
        helper(root.right, false, sum);
    }
}
