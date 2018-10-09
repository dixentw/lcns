package idv.lc.tree;

import java.util.*;

public class LC235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return root;
        if (root.val == p.val || root.val == q.val) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) return root;
        if (left != null) return lowestCommonAncestor(root.left, p, q);
        if (right != null) return lowestCommonAncestor(root.right, p, q);
        return null;
    }
}
