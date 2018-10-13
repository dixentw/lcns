package idv.lc.tree;

import java.util.*;

public class LC426 {
    public TreeNode treeToDoublyList(TreeNode root) {
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
