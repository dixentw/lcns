package idv.lc.tree;

import java.util.*;

public class LC637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null) return res;
        q.offer(root);
        while (!q.isEmpty()) {
            int n = q.size();
            long sum = 0;
            for (int i=0; i<n; i++) {
                TreeNode curr = q.poll();
                if (curr.left!=null) q.offer(curr.left);
                if (curr.right!=null) q.offer(curr.right);
                sum += curr.val;
            }
            res.add((double)sum/(double)n);
        }
        return res;
    }
}
