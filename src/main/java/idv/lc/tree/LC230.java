package idv.lc.tree;

import java.util.*;

public class LC230 {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        int cnt = 0;
        while (!st.empty() || curr != null) {
            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }
            cnt++;
            TreeNode r = st.pop();
            if (cnt == k) return r.val;
            curr = r.right;
        }
        //shouldn't come here
        return -1;
    }
}
