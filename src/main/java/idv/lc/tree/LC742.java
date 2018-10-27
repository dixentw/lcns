package idv.lc.tree;

import java.util.*;

public class LC742 {
    public int findClosestLeaf(TreeNode root, int k) {
        Map<TreeNode, TreeNode> map = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();
        TreeNode knode = find(root,k, map);
        q.offer(knode);
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            if (curr.left == null && curr.right == null) return curr.val;
            if (curr.left != null && visited.add(curr.left)) {
                q.offer(curr.left);
            }
            if (curr.right != null && visited.add(curr.right)) {
                q.offer(curr.right);
            }
            if (map.containsKey(curr) && visited.add(map.get(curr))) {
                q.offer(map.get(curr));
            }
        }
        return -1;
    }
    public TreeNode find(TreeNode root, int k, Map<TreeNode, TreeNode> map) {
        if (root.val == k) return root;
        if (root.left != null) {
            map.put(root.left, root);
            TreeNode left = find(root.left, k, map);
            if (left != null) return left;
        }
        if (root.right != null) {
            map.put(root.right, root);
            TreeNode right = find(root.right, k, map);
            if (right != null) return right;
        }
        return null;
    }
}
