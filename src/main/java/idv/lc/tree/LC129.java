package idv.lc.tree;

import java.util.*;

public class LC129 {
    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }
    public int helper(TreeNode node, int path) {
        if (node == null) return 0;
        int newVal = path * 10 + node.val;
        if (node.left == null && node.right == null) { //leaf
            return newVal;
        }
        return helper(node.left, newVal) + helper(node.right, newVal);
    }
}
