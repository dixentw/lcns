package idv.lc.tree;

import java.util.*;

public class LC538 {
    public TreeNode convertBST(TreeNode root) {
        if (root == null) return root;
        int[] sum = new int[1];
        reverseInorder(root, sum);
        return root;
    }
    public void reverseInorder(TreeNode node, int[] prev) {
        if (node == null) return;
        reverseInorder(node.right, prev);
        node.val += prev[0];
        prev[0] = node.val;
        reverseInorder(node.left, prev);
    }
}
