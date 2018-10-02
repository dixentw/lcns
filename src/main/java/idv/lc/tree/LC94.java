package idv.lc.tree;

import java.util.*;

public class LC94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helperIter(res, root);
        return res;
    }

    public void helper(List<Integer> res, TreeNode root) {
        if (root != null) {
            helper(res, root.left);
            res.add(root.val);
            helper(res, root.right);
        }
    }

    public void helperIter(List<Integer> res, TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !st.empty()) {
            while (curr != null ) {
                st.add(curr);
                curr = curr.left;
            }
            curr = st.pop();
            res.add(curr.val);
            curr = curr.right;
        }
    }
}
