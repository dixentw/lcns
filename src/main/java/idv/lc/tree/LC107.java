package idv.lc.tree;

import java.util.*;

public class LC107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, root, 0);
        return res;
    }
    public void helper(List<List<Integer>> res, TreeNode node, int lv) {
        if (node == null) {
            return;
        }
        if (res.size() <= lv) {
            res.add(0, new ArrayList<>());
        }
        res.get(res.size()-lv-1).add(node.val);
        helper(res, node.left, lv+1);
        helper(res, node.right, lv+1);
    }
}
