package idv.lc.tree;

import java.util.*;

public class LC113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        helper(res, root, path, sum);
        return res;
    }
    public void helper(List<List<Integer>> res, TreeNode node, List<Integer> path, int val) {
        if (node == null) return;
        if (node.left==null && node.right==null && val-node.val==0) {
            path.add(node.val);
            res.add(path);
            return;
        }
        List<Integer> leftPath = new ArrayList<>(path);
        List<Integer> rightPath = new ArrayList<>(path);
        leftPath.add(node.val);
        rightPath.add(node.val);
        helper(res, node.left, leftPath, val-node.val);
        helper(res, node.right, rightPath, val-node.val);
    }
}
