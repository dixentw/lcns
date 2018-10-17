package idv.lc.tree;

import java.util.*;

public class LC515 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null) return res;
        q.offer(root);
        while (!q.isEmpty()) {
            int n = q.size();
            int max = Integer.MIN_VALUE;
            for (int i=0; i<n; i++) {
                TreeNode p = q.poll();
                max = Math.max(max, p.val);
                if (p.left!=null) q.offer(p.left);
                if (p.right!=null) q.offer(p.right);
            }
            res.add(max);
        }
        return res;
    }
}
