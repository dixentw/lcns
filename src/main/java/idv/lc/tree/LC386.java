package idv.lc.tree;

import java.util.*;

public class LC386 {
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        nhelper(root, res);
        return res;
    }
    public int nhelper(TreeNode node, List<List<Integer>> res) {
        if (node == null) return -1;
        int height = 1 + Math.max(nhelper(node.left, res), nhelper(node.right, res));
        if (res.size()==height) res.add(new ArrayList<>());
        res.get(height).add(node.val);
        return height;
    }

    public List<List<Integer>> findLeavesFAIL(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        while (root.val > 0) {
            res.add(new ArrayList<>());
            helper(root, res);
        }
        return res;
    }
    public void helper(TreeNode node, List<List<Integer>> res) {
        if (node == null || node.val < 0) return;
        if (node.left == null && node.right == null ||
                node.left.val < 0 && node.right.val < 0) {
            res.get(res.size()-1).add(node.val);
            node.val = -1 * node.val;
        }
        helper(node.left, res);
        helper(node.right, res);
    }
}
