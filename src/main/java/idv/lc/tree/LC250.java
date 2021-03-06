package idv.lc.tree;

import java.util.*;

public class LC250 {
    public int countUnivalSubtrees(TreeNode root) {
        int[] res = new int[1];
        helper(root, res);
        return res[0];
    }
    public boolean helper(TreeNode node, int[] count) {
        if (node == null) return true;
        boolean left = helper(node.left, count);
        boolean right = helper(node.right, count);
        if (left && right) {
            if (node.left != null && node.val != node.left.val) {
                return false;
            }
            if (node.right != null && node.val != node.right.val) {
                return false;
            }
            count[0]++;
            return true;
        }
        return false;
    }
}
