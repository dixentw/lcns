package idv.lc.tree;

import java.util.*;

public class LC337 {
    public int rob(TreeNode root) {
        int[] res = helper(root);
        return Math.max(res[0], res[1]);
        // here, res[0] is not rob curren node, res[1] is rob current node.
    }
    public int[] helper (TreeNode node) {
        if (node == null) return new int[2];
        int[] left = helper(node.left);
        int[] right = helper(node.right);
        int[] res = new int[2];
        // not rob
        res[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        res[1] = node.val + left[0] + right[0];
        return res;
    }

    public int robFAIL(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int sumOdd = 0;
        int sumEven = 0;
        int level = 0;
        while (!q.isEmpty()) {
            int n = q.size();
            for (int i=0; i<n; i++) {
                TreeNode p = q.poll();
                if (p.left != null) q.offer(p.left);
                if (p.right != null) q.offer(p.right);
                if (level % 2 == 0) {
                    sumEven += p.val;
                } else {
                    sumOdd += p.val;
                }
            }
            level++;
        }
        return (sumOdd > sumEven) ? sumOdd : sumEven;
    }
}
