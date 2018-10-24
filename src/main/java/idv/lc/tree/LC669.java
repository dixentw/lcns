package idv.lc.tree;

import java.util.*;

public class LC669 {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) return root;
        if (root.val < L) return trimBST(root.right, L, R);
        if (root.val > R) return trimBST(root.left, L, R);
        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
    }
    public TreeNode trimBSTRevised(TreeNode root, int L, int R) {
        if (root == null) return root;
        TreeNode left = helper(root.left, L, R);
        TreeNode right = helper(root.right, L, R);
        if (root.val < L) {
            return right;
        }
        if (root.val > R) {
            return left;
        }
        root.left = left;
        root.right = right;
        return root;
    }
}
