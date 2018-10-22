package idv.lc.tree;

import java.util.*;

public class LC623 {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int depth = 1;
        while (!q.isEmpty()) {
            int n = q.size();
            for (int i=0; i<n; i++) {
                TreeNode curr = q.poll();
                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
                if (depth == d-1) { //need to add layer
                    TreeNode l = new TreeNode(v);
                    TreeNode r = new TreeNode(v);
                    l.left = curr.left;
                    r.right = curr.right;
                    curr.left = l;
                    curr.right = r;
                }
            }
            depth++;
        }
        return root;
    }
}
