package idv.lc.tree;

import java.util.*;

public class LC103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while (!queue.isEmpty()) {
            List<Integer> lv = new ArrayList<>();
            int n = queue.size();
            for (int i=0; i<n; i++) {
                if (queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek().right!= null) queue.offer(queue.peek().right);
                if (level%2==0) {
                    lv.add(queue.poll().val);
                } else {
                    lv.add(0, queue.poll().val);
                }
            }
            res.add(lv);
            level++;
        }
        return res;
    }
}


