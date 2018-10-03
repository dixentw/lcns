package idv.lc.tree;

import java.util.*;

public class LC95 {
    public List<TreeNode> generateTrees(int n) {
        if (n<=0) return new ArrayList<TreeNode>(); //leetcode wierd init test case
        return helper(1, n);
    }
    public List<TreeNode> helper(int min, int max) {
        List<TreeNode> res = new ArrayList<>();
        if (min > max) {
            res.add(null);
            return res;
        }
        /* by calling helper() for left child and right child
         * both will return null
         * so append it with inner most loop is sufficient for this block
        if (min == max) {
            list.add(new TreeNode(min));
            return list;
        }*/
        List<TreeNode> left;
        List<TreeNode> right;
        for (int i=min; i<=max; i++) {
            left = helper(min, i-1);
            right = helper(i+1, max);
            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    res.add(root);
                }
            }
        }
        return res;
    }
}
