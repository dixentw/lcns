package idv.lc.tree;

import java.util.*;

public class LC863 {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        Map<TreeNode, TreeNode> path = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        TreeNode t = findNode(root, target, path);
        if (t==null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();
        visited.add(t);
        q.offer(t);
        int lv=0;
        while (!q.isEmpty()) {
            int n = q.size();
            for (int i=0; i<n; i++) {
                TreeNode curr = q.poll();
                if (curr.left!=null && visited.add(curr.left)) q.offer(curr.left);
                if (curr.right!=null && visited.add(curr.right)) q.offer(curr.right);
                if (path.containsKey(curr) && visited.add(path.get(curr))) {
                    q.offer(path.get(curr));
                }
                if (lv == K) {
                    res.add(curr.val);
                }
            }
            lv++;
        }
        return res;
    }
    public TreeNode findNode(TreeNode root, TreeNode target, Map<TreeNode, TreeNode> path) {
        if (root.val == target.val) {
            return root;
        }
        if (root.left != null) {
            path.put(root.left, root);
            TreeNode left = findNode(root.left, target, path);
            if (left != null) return left;
        }
        if (root.right != null) {
            path.put(root.right, root);
            TreeNode right = findNode(root.right, target, path);
            if (right != null) return right;
        }
        return null;
    }
}
