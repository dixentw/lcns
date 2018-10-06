package idv.lc.tree;

import java.util.*;

public class LC116 {
    public void connect(TreeLinkNode root) {
        if (root == null) return;
        Queue<TreeLinkNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int lvCnt = q.size();
            for (int i=0; i<lvCnt; i++) {
                if (q.peek().left!=null) q.offer(q.peek().left);
                if (q.peek().right!=null) q.offer(q.peek().right);
                if (i!=lvCnt-1) q.poll().next = q.peek();
            }
            q.poll();
        }
    }
}
