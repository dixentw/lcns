package idv.lc.tree;

import java.util.*;

public class LC257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        helper(res, new ArrayList<>(), root);
        return res;
    }
    public void helper(List<String> res, List<String> path, TreeNode node) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            path.add(String.valueOf(node.val));
            res.add(String.join("->", path));
            return;
        }
        path.add(String.valueOf(node.val));
        List<String> nPath = new ArrayList<>(path);
        helper(res, path, node.left);
        helper(res, nPath, node.right);
    }
}
