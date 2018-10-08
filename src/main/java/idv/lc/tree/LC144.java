package idv.lc.tree;

import java.util.*;

public class LC144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        st.push(curr);
        while (!st.empty()) {
            curr = st.pop();
            res.add(curr.val);
            if (curr.right != null) st.push(curr.right);
            if (curr.left != null) st.push(curr.left);
        }
        return res;
    }
    public List<Integer> preorderTraversalRec(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(res, root);
        return res;
    }
    public void helper(List<Integer> res, TreeNode node) {
        if (node != null) {
            res.add(node.val);
            helper(res, node.left);
            helper(res, node.right);
        }
    }
}
