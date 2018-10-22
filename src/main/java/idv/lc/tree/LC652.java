package idv.lc.tree;

import java.util.*;

public class LC652 {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res = new ArrayList<>();
        if (root == null) return res;
        Map<String, Integer> dic = new HashMap<>();
        traveler(root, dic, res);
        return res;
    }
    public String traveler(TreeNode root, Map<String, Integer> dic, List<TreeNode> res) {
        if(root == null) return "";
        String left = traveler(root.left, dic, res);
        String right = traveler(root.right, dic, res);
        String curr = String.valueOf(root.val) + "," + left + "," + right;
        int cnt = dic.getOrDefault(curr, 0);
        if (cnt == 1) res.add(root);
        dic.put(curr, cnt+1);
        return curr;
    }
}
