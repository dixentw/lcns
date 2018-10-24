package idv.lc.tree;

import java.util.*;

public class LC671 {
    public int findSecondMinimumValue(TreeNode root) {
        int rootVal = root.val;
        int second = Integer.MAX_VALUE;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int n = q.size();
            for (int i=0; i<n; i++) {
                TreeNode curr = q.poll();
                if (curr.val != root.val && curr.val < second) second = curr.val;
                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
            }
        }
        if (second != Integer.MAX_VALUE) return second;
        return -1;
    }
}
