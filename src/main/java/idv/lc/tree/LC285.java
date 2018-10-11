package idv.lc.tree;

import java.util.*;

public class LC285 {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        Stack<TreeNode> st = new Stack<>();
        boolean found = false;
        TreeNode curr = root;
        while (!st.empty() || curr != null) {
            if (curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                TreeNode node = st.pop();
                curr = node.right;
                if (found) return node;
                if (node.val == p.val) found = true;
                /*
                TreeNode node = st.pop();
                if (node.right != null) st.push(node.right);
                if (node.val == p.val) {
                    found = true;
                } else {
                    if (found) {
                        return node;
                    }
                }*/
            }
        }
        return null;
    }
}
