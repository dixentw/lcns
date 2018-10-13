package idv.lc.tree;

import java.util.*;

public class LC298 {
    public int longestConsecutive(TreeNode root) {
        if (root == null) return 0;
        int[] max = new int[1];
        newHelper(root, 0, root.val, max);
        return max[0];
    }
    public void newHelper(TreeNode node, int curr, int target, int[] max) {
        if (node == null) return;
        if (node.val == target+1) curr++;
        else curr = 1;
        max[0] = Math.max(max[0], curr);
        newHelper(node.left, curr, node.val, max);
        newHelper(node.right, curr, node.val, max);
    }

    public int longestConsecutiveFAIL(TreeNode root) {
        if (root == null) return 0;
        List<Integer> p = new ArrayList<>();
        p.add(root.val);
        List<Integer> pr = new ArrayList<>(p);
        List<List<Integer>> res = new ArrayList<>();
        helper(root.left, root, p, res);
        helper(root.right, root, pr, res);
        int max = 0;
        for (List<Integer> l : res) {
            System.out.println(Arrays.toString(l.toArray()));
            max = Math.max(max, l.size());
        }
        return max;
    }
    public void helper(TreeNode node, TreeNode parent, List<Integer> path, List<List<Integer>> res) {
        if (node == null) {
            res.add(new ArrayList<>(path));
            return;
        }
        if (parent.val == node.val-1) {
            path.add(node.val);
        } else {
            path.clear();
            path.add(node.val);
        }
        List<Integer> nPath = new ArrayList<>(path);
        helper(node.left, node, path, res);
        helper(node.right, node, nPath, res);
    }
}
