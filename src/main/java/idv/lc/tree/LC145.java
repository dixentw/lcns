package idv.lc.tree;

import java.util.*;

public class LC145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Stack<TreeNode> st = new Stack<>();
        Stack<TreeNode> st1 = new Stack<>();
        st.push(root);
        while (!st.empty()) {
            TreeNode tmp = st.pop();
            if (tmp.left != null) st.push(tmp.left);
            if (tmp.right != null) st.push(tmp.right);
            st1.push(tmp);
        }
        while (!st1.empty()) {
            res.add(st1.pop().val);
        }
        return res;
    }
}
