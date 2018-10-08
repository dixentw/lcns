package idv.lc.tree;

import java.util.*;

public class LC199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int lv = q.size();
            for (int i=0; i<lv; i++) {
                if (q.peek().left != null) q.offer(q.peek().left);
                if (q.peek().right != null) q.offer(q.peek().right);
                TreeNode lvNode = q.poll();
                if (i == lv-1) res.add(lvNode.val);
            }
        }
        return res;
    }
}
