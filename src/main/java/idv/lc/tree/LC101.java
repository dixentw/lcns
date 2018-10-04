package idv.lc.tree;

import java.util.*;

public class LC101 {
    public boolean isSymmetric(TreeNode root) {
        if (root==null) return true;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);
        TreeNode left, right;
        while (!stack.empty()) {
            left = stack.pop();
            right = stack.pop();
            if (left==null && right==null) continue;
            if (left ==null || right==null || left.val != right.val) {
                return false;
            }
            stack.push(left.left);
            stack.push(right.right);
            stack.push(left.right);
            stack.push(right.left);
        }
        return true;
    }
    public boolean isSymmetricRecursive(TreeNode root) {
        if (root==null) return true;
        return helper(root.left, root.right);
    }
    public boolean helper(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return  p == q;
        }
        if (p.val!=q.val) return false;
        return helper(p.right, q.left) && helper(p.left, q.right);
    }
}
