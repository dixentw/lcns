package idv.lc.tree;

import java.util.*;

public class LC426 {
    TreeNode prev = null;
    public TreeNode treeToDoublyList(TreeNode root) {
        if (root == null) return root;
        TreeNode dummy = new TreeNode(0);
        prev = dummy;
        helper(root);
        prev.right = dummy.right;
        dummy.right.left = prev;
        return dummy.right;
    }
    public void helper(TreeNode root) {
        if (root == null) return;
        helper(root.left);
        prev.right = root;
        root.left = prev;
        prev = root;
        helper(prev.right);
    }

    public TreeNode _treeToDoublyList(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        TreeNode prev = null;
        TreeNode head = null;
        while (!st.empty() || curr!= null) {
            if (curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                curr = st.pop();
                if (prev != null) {
                    prev.right = curr;
                    curr.left = prev;
                } else {
                    head = curr;
                }
                prev = curr;
                curr = curr.right;
            }
        }
        prev.right = head;
        head.left = prev;
        return head;
    }
}
