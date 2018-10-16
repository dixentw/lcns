package idv.lc.tree;

import java.util.*;

public class LC513 {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int n = q.size();
            TreeNode first = null;
            for (int i=0; i<n; i++) {
                TreeNode p = q.poll();
                if (i==0) first = p;
                if (p.left != null) q.offer(p.left);
                if (p.right != null) q.offer(p.right);
            }
            if (q.size()==0) return first.val;
        }
        //shouldn't be here
        return -1;
    }
}
