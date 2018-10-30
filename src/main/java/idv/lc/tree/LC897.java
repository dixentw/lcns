package idv.lc.tree;

import java.util.*;

public class LC897 {
    public TreeNode increasingBST(TreeNode root) {
        if (root == null) return root;
        TreeNode head = null;
        TreeNode prev = null;
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        while (!st.empty() || curr != null) {
            if (curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                curr = st.pop();
                if (prev == null) {
                    prev = curr;
                    head = curr;
                } else {
                    prev.right = curr;
                    prev = curr;
                }
                //[FAIL] should be clear
                curr.left = null;
                curr = curr.right;
            }
        }
        return head;
    }
}
